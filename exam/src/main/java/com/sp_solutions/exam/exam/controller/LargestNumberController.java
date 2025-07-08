package com.sp_solutions.exam.exam.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class LargestNumberController {

    @PostMapping("/largest-number")
    public String getLargestNumber(@RequestBody List<Integer> numbers) {
        return largestNumber(numbers);
    }

    private String largestNumber(List<Integer> numbers) {
        List<String> numberStrs = new ArrayList<>();
        for (Integer num : numbers) {
            numberStrs.add(String.valueOf(num));
        }

        Collections.sort(numberStrs, (a, b) -> (b + a).compareTo(a + b));

        if (numberStrs.get(0).equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String numStr : numberStrs) {
            result.append(numStr);
        }

        return result.toString();
    }

}
