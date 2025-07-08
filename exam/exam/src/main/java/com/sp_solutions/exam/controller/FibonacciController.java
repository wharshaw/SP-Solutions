package com.sp_solutions.exam.controller;

@RestController
@RequestMapping("/api/fibonacci")
public class FibonacciController {

    @GetMapping("/first100")
    public List<Long> getFirst100Fibonacci() {
        List<Long> fibonacciList = new ArrayList<>();
        int count = 100;

        if (count >= 1) fibonacciList.add(0L);
        if (count >= 2) fibonacciList.add(1L);

        for (int i = 2; i < count; i++) {
            long next = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(next);
        }

        return fibonacciList;
    }

}
