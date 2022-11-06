package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Complexity;

/**
 * Tasks for assessing the algorithm complexity.
 * The following are the ratios of the constants with the BigO estimate:
 * <p>
 * Complexity.O_LOG_N       -> O(log N)
 * Complexity.O_N_2         -> O(log N^2)
 * Complexity.O_FACTORIAL_N -> O(!N)
 * Complexity.O_2_N         -> O(2 * N)
 * Complexity.O_N_LOG_N     -> O(N * log N)
 * Complexity.O_1           -> O(1)
 * Complexity.O_N           -> O(N)
 */
public class AlgorithmComplexity {

    /**
     * Return the linear search complexity if the element you are looking for is at the end of the array.
     */
    public static Complexity badLinerSearch() {

        int[] arr = new int[]{1, 2, 3};
        int c = arr.length;
        int other = arr[arr.length - 1];
        System.out.println(other);
        return null;
    }

    public static void main(String[] args) {
        badLinerSearch();

    }

    /**
     * Return the complexity of accessing an array element by index.
     */
    public static Complexity arrayIndexItemAccess() {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr[2]);

        return null;
    }


    /**
     * Return the complexity of a binary search.
     */
    public Complexity binarySorting() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int low = 0, high = 0, key = 0;
        if (low >= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return binarySorting();
            }
            if (arr[mid] > key) {
                return binarySorting();
            } else {

            }

        }
        return binarySorting();
    }

    /**
     * Return the complexity of the twoCycleSorting algorithm.
     */
    public Complexity twoCycleSorting() {
        int intArray[] = {12, 2, 20, 76, 50};
        int i = 0;
        while (i < intArray.length) {
            if (intArray[i] - 1 != i) {
                int index = intArray[i] - 1;

                int x = intArray[i];
                intArray[i] = intArray[index];
                intArray[index] = x;
            } else {
                i++;
            }
        }
        return  twoCycleSorting();
    }
}



