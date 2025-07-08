package com.sp_solutions.exam.exam.service;

import com.sp_solutions.exam.exam.model.Category;
import com.sp_solutions.exam.exam.model.Comment;
import com.sp_solutions.exam.exam.model.News;
import com.sp_solutions.exam.exam.repository.CategoryRepository;
import com.sp_solutions.exam.exam.repository.CommentRepository;
import com.sp_solutions.exam.exam.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CommentRepository commentRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public List<News> getNewsByCategory(Long categoryId) {
        return newsRepository.findByCategories_Id(categoryId);
    }

    public Optional<News> getNewsById(Long newsId) {
        return newsRepository.findById(newsId);
    }

    public Comment addComment(Long newsId, Comment comment) {
        News news = newsRepository.findById(newsId).orElseThrow();
        comment.setNews(news);
        return commentRepository.save(comment);
    }
}
