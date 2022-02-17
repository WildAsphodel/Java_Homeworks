
/**
 * Java1. Homework #3
 * 
 * @author Margarita Antonova
 * @version 17.02.2022
 */

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        System.out.println();
        multiplyBy2();
        diagonal();
        System.out.println(Arrays.toString(arrayOutput(3, 5)));
        System.out.println();
        arrayMaxMin();
    }

    static void invertArray() {
        int[] arr = { 1, 0, 1, 1, 0, 1, 0 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    static void multiplyBy2() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    static void diagonal() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || j == arr[i].length - 1 - i) {
                    arr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
    }

    static int[] arrayOutput(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    static void arrayMaxMin() {
        int[] arr = { 5, 1, 3, 2, 11 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("max " + max + ", min " + min);
    }
}
