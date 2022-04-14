package com.practice.hellojava;

// Problem:
// Given a non-empty positive integer array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
//
// canBalance([1, 1, 1, 2, 1]) → true
// canBalance([2, 1, 1, 2, 1]) → false
// canBalance([3, 1, 1, 1]) → true

import java.util.Arrays;

public class ArrayBalancer {
    public boolean canBalance(int[] arr) {
        if (arr.length < 2) return false;

        int sum = Arrays.stream(arr).sum();
        if (sum % 2 == 1) return false;

        int left = 0;
        for (int j : arr) {
            left += j;
            if (left == sum/2) return true;
            if (left > sum/2) return false;
        }
        return false;
    }
}
