package com.practice.hellojava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayBalancerTest {
    private final ArrayBalancer arrayBalancer = new ArrayBalancer();

    @Test
    void test (){
        assertTrue(arrayBalancer.canBalance(new int[]{ 1, 2, 2, 1}));
        assertFalse(arrayBalancer.canBalance(new int[]{2, 1, 1, 2, 1}));
        assertTrue(arrayBalancer.canBalance(new int[]{3, 1, 1, 1}));
        assertTrue(arrayBalancer.canBalance(new int[]{6, 1, 2, 3}));
        assertTrue(arrayBalancer.canBalance(new int[]{4, 2, 2, 3, 1}));
        assertTrue(arrayBalancer.canBalance(new int[]{4, 1, 2, 1, 2, 10}));
        assertTrue(arrayBalancer.canBalance(new int[]{5, 1, 1, 7}));
        assertTrue(arrayBalancer.canBalance(new int[]{5, 3, 3, 2, 9}));
        assertTrue(arrayBalancer.canBalance(new int[]{5, 3, 3, 1, 1, 2, 9}));
        assertFalse(arrayBalancer.canBalance(new int[]{1, 2, 3, 4, 5, 2, 4, 6, 8}));
    }
}