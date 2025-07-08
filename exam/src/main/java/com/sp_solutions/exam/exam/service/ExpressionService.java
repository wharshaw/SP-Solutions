package com.sp_solutions.exam.exam.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpressionService {

    public List<String> findExpressionsEqualTo100() {
        List<String> result = new ArrayList<>();
        findCombinations(result, "1", 1, 1, 2);
        return result;
    }

    private void findCombinations(List<String> result, String expression, long currentSum, long lastNumber, int nextNumber) {
        if (nextNumber == 10) {
            if (currentSum == 100) {
                result.add(expression + " = 100");
            }
            return;
        }

        findCombinations(result,
                expression + "+" + nextNumber,
                currentSum + nextNumber,
                nextNumber,
                nextNumber + 1);

        findCombinations(result,
                expression + "-" + nextNumber,
                currentSum - nextNumber,
                -nextNumber,
                nextNumber + 1);

        long concatenatedNumber = Long.parseLong(String.valueOf(Math.abs(lastNumber)) + nextNumber);
        long newSum;
        if (lastNumber >= 0) {
            newSum = currentSum - lastNumber + concatenatedNumber;
        } else {
            newSum = currentSum - lastNumber - concatenatedNumber;
            concatenatedNumber = -concatenatedNumber;
        }

        findCombinations(result,
                expression + nextNumber,
                newSum,
                concatenatedNumber,
                nextNumber + 1);
    }
}

