package com.tasks.dlinaElementov;

      /* 1. Введи с клавиатуры 5 слов в список строк.
        2. Определить, является ли список упорядоченным по возрастанию длины строки.
        3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
      */



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < list.size(); ) {
            if (list.get(i).length() <= list.get(i + 1).length()) {
                i++;
            }
            else {
                System.out.println(list.get(i + 1));
                break;
            }
        }
    }
}
