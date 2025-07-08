package com.sp_solutions.exam.exam.controller;

import com.sp_solutions.exam.exam.service.ExpressionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExpressionController {

    private final ExpressionService expressionService;

    @Autowired
    public ExpressionController(ExpressionService expressionService) {
        this.expressionService = expressionService;
    }

    @GetMapping("/expressions")
    public List<String> getExpressions() {
        return expressionService.findExpressionsEqualTo100();
    }
}

