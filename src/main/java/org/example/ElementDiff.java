package org.example;

public class ElementDiff {
    public static int elementDiff(int[] arr){
        int min = 20;
        int max = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        int diff = max - min;
        return diff;
    }
}
