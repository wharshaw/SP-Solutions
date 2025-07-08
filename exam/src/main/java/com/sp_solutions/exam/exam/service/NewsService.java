package com.sp_solutions.exam.exam.service;

@Service
public class NewsService {
    @Autowired private NewsRepository newsRepository;
    @Autowired private CategoryRepository categoryRepository;
    @Autowired private CommentRepository commentRepository;

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
