package com.epam.algorithms;

import java.beans.PropertyEditorSupport;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {
    public String[] seasonsArray() {
        return new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }
    public int[] generateNumbers(int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++){
            result[i] = i+1;
        }
        return result;
    }
    public int totalSum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }
    public int findIndexOfNumber(int[] arr, int number) {
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[0] == number){
                result = i;
                break;
            } else {
                result = 0;
            }
        }
        return result;
    }
    public String[] reverseArray(String[] arr) {
        return null;
    }
    public int[] getOnlyPositiveNumbers(int[] arr) {
        return null;
    }
    public int[][] sortRaggedArray(int[][] arr) {
        return null;
    }
}