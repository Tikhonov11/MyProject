package com.tasks.jolushka;
/* 1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод print выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний. */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;




public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> spisok1 = new ArrayList<Integer>();
        ArrayList<Integer> spisok2 = new ArrayList<Integer>();
        ArrayList<Integer> spisok3 = new ArrayList<Integer>();
        int a = 0;
        while (a < 20) {
            int x = Integer.parseInt(reader.readLine());
            if (x % 3 == 0) {
                spisok1.add(x);
            }

            if (x % 2 == 0) {
                spisok2.add(x);
            }

            if ((x % 3 != 0) && (x % 2 == 0)) {
                spisok3.add(x);
            }
            a++;
        }

        print(spisok1);
        System.out.println();

        print(spisok2);
        System.out.println();

        print(spisok3);
        System.out.println();

    }

    public static void print(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
