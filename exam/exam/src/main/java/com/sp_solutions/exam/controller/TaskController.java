package com.sp_solutions.exam.controller;

@RestController
@RequestMapping("/sum")
public class TaskController {

    @PostMapping("/for-loop")
    public int sumUsingForLoop(@RequestBody List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    @PostMapping("/while-loop")
    public int sumUsingWhileLoop(@RequestBody List<Integer> numbers) {
        int sum = 0;
        int i = 0;
        while (i < numbers.size()) {
            sum += numbers.get(i);
            i++;
        }
        return sum;
    }

    @PostMapping("/recursion")
    public int sumUsingRecursion(@RequestBody List<Integer> numbers) {
        return sumRecursive(numbers, 0);
    }

    private int sumRecursive(List<Integer> numbers, int index) {
        if (index >= numbers.size()) {
            return 0;
        }
        return numbers.get(index) + sumRecursive(numbers, index + 1);
    }

}
