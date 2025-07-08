package com.sp_solutions.exam.service;

@Service
public class ListCombineService {
    public <T> List<T> combineAlternately(List<T> list1, List<T> list2) {
        List<T> combinedList = new ArrayList<>();

        int size = Math.min(list1.size(), list2.size());

        for (int i = 0; i < size; i++) {
            combinedList.add(list1.get(i));
            combinedList.add(list2.get(i));
        }

        if (list1.size() > size) {
            combinedList.addAll(list1.subList(size, list1.size()));
        } else if (list2.size() > size) {
            combinedList.addAll(list2.subList(size, list2.size()));
        }

        return combinedList;
    }

}
