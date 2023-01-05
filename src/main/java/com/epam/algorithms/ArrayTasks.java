package com.epam.algorithms;
import java.beans.PropertyEditorSupport;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
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
        String[] reversedArray = new String[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            reversedArray[j] = arr[i];
            j++;
        }
        return reversedArray;
    }
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[] result = new int[0];
        for (int j : arr)
            if (j > 0) {
                if (result.length > 0) {
                    int[] tempArr = new int[result.length + 1];
                    tempArr[tempArr.length - 1] = j;
                    System.arraycopy(result, 0, tempArr, 0, result.length);
                    result = tempArr;
                } else {
                    result = new int[1];
                    result[0] = j;
                }
            }
        return result;
    }
    public int[][] sortRaggedArray(int[][] arr) {
        int[][] result = new int[1][1];
        return result;
    }
}