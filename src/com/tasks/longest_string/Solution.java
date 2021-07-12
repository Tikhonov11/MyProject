package com.tasks.longest_string;

import java.io.*;
import java.util.ArrayList;

/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        int max = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i).length()) {
                max = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (max == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }
    }
}
