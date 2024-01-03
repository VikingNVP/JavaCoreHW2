package org.example;

import java.util.Random;

public class CountEvens {
    public static int countEvens(int[] array1){
        int count = 0;
        for (int i = 0; i < array1.length - 1; i++){
            if (array1[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
