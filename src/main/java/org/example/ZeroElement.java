package org.example;

public class ZeroElement {
    public static boolean zeroElement(int[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 0) {
                if (arr[i + 1] == 0 || arr[i - 1] == 0) {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
