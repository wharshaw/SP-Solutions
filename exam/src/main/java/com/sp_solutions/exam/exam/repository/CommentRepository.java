package com.sp_solutions.exam.exam.repository;

import com.sp_solutions.exam.exam.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}

