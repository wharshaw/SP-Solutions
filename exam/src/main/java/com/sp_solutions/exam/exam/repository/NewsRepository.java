package com.sp_solutions.exam.exam.repository;

import com.sp_solutions.exam.exam.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findByCategories_Id(Long categoryId);
}
