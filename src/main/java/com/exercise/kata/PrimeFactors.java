package com.exercise.kata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David_Mogyorosi on 2/10/2017.
 */
public class PrimeFactors {

    public List<Integer> getListOfFactors(Integer input) {
        List<Integer> result = new ArrayList<>();

        for (int i = 2; i <= input; ++i) {
            while (isPrime(i) && input % i == 0) {
                result.add(i);
                input = input / 2;
            }
        }
        return result;
    }

    private boolean isPrime(int number) {
        int divisorsCount = 0;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                ++divisorsCount;
            }
        }
        return (divisorsCount < 1);
    }
}
