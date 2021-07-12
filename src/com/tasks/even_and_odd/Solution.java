package com.tasks.even_and_odd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Ввести с клавиатуры положительное число.
Определить, сколько в введенном числе четных цифр, а сколько нечетных
Вывести результат на экран.
 */

public class Solution {
    public static int oddCounter = 0;
    public static int evenCounter = 0;


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        while (number > 0) {
            int x = number % 10;
            if (x % 2 == 0) {
                evenCounter++;

            } else {
                oddCounter++;
            }

            number = number / 10;
        }
        System.out.println("Even: " + evenCounter);
        System.out.println("Odd: " + oddCounter);
    }
}
