package org.example;

import java.util.Random;
import java.util.Scanner;

import static org.example.CountEvens.countEvens;
import static org.example.ElementDiff.elementDiff;
import static org.example.ZeroElement.zeroElement;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задай числом нужную длину массива: ");
        Scanner s = new Scanner(System.in);
        int arrayLength = s.nextInt();
        int[] arr = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(0, 10);
        }
        System.out.println("Ваш созданный массив: " + arr.toString());

        System.out.println("Выбери нужную функцию: \n1.Найти кол-во чётных чисел" +
                "\n2.Найти разницу Max/Min" +
                "\n3.Найти истину, если соседние элементы нулевые");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if(c == 1){
            System.out.println(countEvens(arr));
        }
        if(c == 2){
            System.out.println(elementDiff(arr));
        } else if (c == 3) {
            System.out.println(zeroElement(arr));
        } else System.out.println("Конец программы");
    }
}
