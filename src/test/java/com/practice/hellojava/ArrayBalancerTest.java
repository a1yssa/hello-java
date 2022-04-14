package com.practice.hellojava;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayBalancerTest {
    private final ArrayBalancer arrayBalancer = new ArrayBalancer();

     private int[] setArray(){
        int [] arr = new int[1000000];
        Arrays.fill(arr, 1);
        return arr;
    }

    @Test
    void test (){
        assertFalse(arrayBalancer.canBalance(new int[]{}));
        assertFalse(arrayBalancer.canBalance(new int[]{1}));
        assertTrue(arrayBalancer.canBalance(new int[]{ 1, 2, 2, 1}));
        assertFalse(arrayBalancer.canBalance(new int[]{2, 1, 1, 2, 1}));
        assertTrue(arrayBalancer.canBalance(new int[]{3, 1, 1, 1}));
        assertTrue(arrayBalancer.canBalance(new int[]{6, 1, 2, 3}));
        assertTrue(arrayBalancer.canBalance(new int[]{4, 2, 2, 3, 1}));
        assertTrue(arrayBalancer.canBalance(new int[]{4, 1, 2, 1, 2, 10}));
        assertTrue(arrayBalancer.canBalance(new int[]{5, 1, 1, 7}));
        assertTrue(arrayBalancer.canBalance(new int[]{5, 3, 3, 2, 9}));
        assertTrue(arrayBalancer.canBalance(new int[]{5, 3, 3, 1, 1, 2, 9}));
        assertFalse(arrayBalancer.canBalance(new int[]{1000, 2, 3, 4, 5, 2, 4, 6, 8}));

        assertTrue(arrayBalancer.canBalance(new int[1000000])); //1000000 elements of 0
        assertTrue(arrayBalancer.canBalance(setArray())); //1000000 elements of 1

        int[] arr = setArray();
        arr[arr.length-1] = 2;
        assertFalse(arrayBalancer.canBalance(arr)); //1000000 elements, last element 2
    }
}