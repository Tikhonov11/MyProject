package com.tasks.letter_counter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра.
Результат выведи на экран в алфавитном порядке
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        List<String> alphabet = Arrays.asList(
                "а", "б", "в", "г", "д", "е", "ё", "ж",
                "з", "и", "й", "к", "л", "м", "н", "о",
                "п", "р", "с", "т", "у", "ф", "х", "ц",
                "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я");

        for (int i = 0; i < 10; i++) {

            String s = reader.readLine();
            str += s;
        }

        String[] subStr;
        subStr = str.split("");
        List<String> arrayToList = new ArrayList<>();

        for (int i = 0; i < subStr.length; i++) {
            arrayToList.add(subStr[i].toLowerCase());
        }

        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < alphabet.size(); i++) {
            for (String temp : arrayToList) {
                if (temp.equals(alphabet.get(i))) {
                    count++;
                }
                map.put(alphabet.get(i), count);
            }
            count = 0;
        }

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + map.get(alphabet.get(i)));
        }
    }
}
