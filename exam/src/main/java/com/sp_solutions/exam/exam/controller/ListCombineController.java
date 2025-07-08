package com.sp_solutions.exam.exam.controller;

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
