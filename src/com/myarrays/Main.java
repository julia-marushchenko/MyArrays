/**
 * Java program to sort array of Strings according to their length.
 */

package com.myarrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an array.
        String[] array = {"bb", "a", "ccc"};

        // Sorting the array.
        Arrays.sort(array, Comparator.comparingInt(String :: length));

        // Printing the sorted array to console.
        for (int i = 0; i <array.length ; i++) {

            System.out.println(array[i]);

        }

    }
}