package com.company;

import java.io.*;
import java.util.*;

// Problem:
// Given a non-empty positive integer array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
//
// canBalance([1, 1, 1, 2, 1]) → true
// canBalance([2, 1, 1, 2, 1]) → false
// canBalance([3, 1, 1, 1]) → true

public class splitSum {

    public static void main(String[] args) {
            int[] testArray = { 1, 2, 2, 1};
            test(testArray, true);

            int[] testArray2 = {2, 1, 1, 2, 1};
            test(testArray2, false);

            int[] testArray3 = {3, 1, 1, 1};
            test(testArray3, true);

            //

            int[] testArray4 = {6, 1, 2, 3};
            test(testArray4, true);

            int[] testArray5 = {4, 2, 2, 3, 1};
            test(testArray5, true);

            int[] testArray6 = {4, 1, 2, 1, 2, 10};
            test(testArray6, true);

            int[] testArray7 = {5, 1, 1, 7};
            test(testArray7, true);

            int[] testArray8 = {5, 3, 3, 2, 9};
            test(testArray8, true);

            int[] testArray9 = {5, 3, 3, 1, 1, 2, 9};
            test(testArray9, true);

            int[] testArray10= {1, 2, 3, 4, 5, 2, 4, 6, 8};
            test(testArray10, false);
        }

        public static void test(int[] nums, boolean result) {
            Boolean check = canBalance(nums);
            if (check == result){
                System.out.println(Arrays.toString(nums) + " -> OK");
            }
            else{
                System.out.println(Arrays.toString(nums) + " -> expecting " + result);
            }
        }

        public static boolean canBalance(int[] nums) {
            int left = 0;
            int sum = 0;
            for(int i = 0; i < nums.length; i++){
                sum = sum + nums[i];
            }

            for(int i = 0; i < nums.length; i++){
                left = left + nums[i];
                if (left == (sum - nums[i])){
                    return true;
                }
                sum = sum - nums[i];
            }
            return false;
        }
    }
