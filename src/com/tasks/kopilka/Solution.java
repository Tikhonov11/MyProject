package com.tasks.kopilka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Вводить с клавиатуры числа и считать их сумму,
 пока пользователь не введет слово "сумма".
 Вывести на экран полученную сумму. */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
            try {
                int a = Integer.parseInt(reader.readLine());
                sum += a;
            } catch (NumberFormatException e) {
                System.out.println(sum);
                break;
            }
        }
    }
}
