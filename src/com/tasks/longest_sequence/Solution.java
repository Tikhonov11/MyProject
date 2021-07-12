package com.tasks.longest_sequence;

/* 1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {

            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }

        int prev = list.get(0);
        int count = 1;
        int result = 0;

        for (int i = 1; i < list.size() - 1; i++) {

            if (prev == list.get(i)) {
                count++;

                if (count > result) {
                    result = count;
                }
            }
            else {
                count = 1;
            }
            prev = list.get(i);
        }
        System.out.println(result);
    }
}
