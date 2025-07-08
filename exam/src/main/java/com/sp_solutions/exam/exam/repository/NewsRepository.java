package com.sp_solutions.exam.exam.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findByCategories_Id(Long categoryId);
}
