package com.sp_solutions.exam.exam.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}

