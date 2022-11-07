package com.epam.mjc.stage0;

import java.util.Arrays;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String [] seasons = {"winter", "spring", "summer", "autumn"};
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }
        return seasonsArray();


    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] numbers = {1, 7, 11, 4, 5, 10};
        for (int n : numbers) {
            if (n > length) {
                int[] nums = numbers;
                System.out.println(nums);
            }


        } return numbers;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int [] num1 = {1, 3, 5, 7, 9};
        int sum = 0;
        for (int i : num1) {
            sum +=i;
        }
        System.out.println(sum);

        return sum;
    }




    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int count = 0;
        int x = 20;
        int [] num2 = {10, 5, 19, 22, 20};

        boolean isX = false;
        for (int i = 0; i < number; i++) {
            if (arr[i] == x) {
                isX = true;
            }
            else if (arr[i] < x) {
                count++;
            }
            System.out.println(findIndexOfNumber(arr, x));
        }
        return (isX == false) ? -1 : count;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int a = 0;
        int[] newArray = {1, 5, 67, -9, 0};
        while (a < newArray.length)
            if (newArray[a] > 0) {
                System.out.println(newArray[a]);
                a++;
            }

        return newArray;
    }



        /**
         * Return a sorted, ragged, two-dimensional int[][] array following these rules:
         * Incoming one-dimensional arrays must be arranged in ascending order of their length;
         * numbers in all one-dimensional arrays must be in ascending order.
         * <p>
         * Example:
         * <p>
         * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
         * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
         */
        public int[][] sortRaggedArray( int[][] arr) {
            int[][] numbers2 = {
                    {7, 2, 3, 10, 5},
                    {3, 8, 2}
            };
            for (int col = 0; col < numbers2[0].length; col++) {
                for (int i = 1; i < numbers2.length; i++) {
                    for (int j = i; j < numbers2.length; j++) {
                        if (numbers2[j - 1][col] > numbers2[j][col]) {
                            int temp = numbers2[j][col];
                            numbers2[j][col] = numbers2[j - 1][col];
                            numbers2[j - 1][col] = temp;

                        }
                        System.out.println(numbers2);
                    }
                }
            }
            return numbers2;
        }





    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] words = {"banana", "pineapple", "kiwi"};

        for (int i = words.length; i >= 0; i--) {
            System.out.println(words[i]);

        }


        return words;
    }
}


