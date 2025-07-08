package com.sp_solutions.exam.exam.controller;

import com.sp_solutions.exam.exam.service.ListCombineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/lists")
public class ListCombineController {
    @Autowired
    private ListCombineService listCombineService;

    @PostMapping("/combine")
    public List<String> combineLists(@RequestBody List<List<String>> inputLists) {
        if (inputLists.size() != 2) {
            throw new IllegalArgumentException("Please provide exactly two lists.");
        }
        return listCombineService.combineAlternately(inputLists.get(0), inputLists.get(1));
    }

}
