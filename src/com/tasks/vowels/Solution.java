package com.tasks.vowels;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

        /*Написать программу, которая вводит с клавиатуры строку текста.
        Программа должна вывести на экран две строки:
        1. первая строка содержит только гласные буквы из введённой строки.
        2. вторая - только согласные буквы и знаки препинания из введённой строки.
        Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
        */

class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static ArrayList<Character> vowelsArray = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < vowels.length; i++) {
            vowelsArray.add(vowels[i]);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String words = reader.readLine();
        char[] wordsToArray = words.toCharArray();

        for (int i = 0; i < wordsToArray.length; i++) {
            if (isVowels(wordsToArray[i])) {
                System.out.print(wordsToArray[i] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < wordsToArray.length; i++) {
            if ((!isVowels(wordsToArray[i])) && (wordsToArray[i] != ' ')) {
                System.out.print(wordsToArray[i] + " ");
            }
        }
    }

    public static boolean isVowels(Character c) {
        c = Character.toLowerCase(c);
        if (vowelsArray.contains(c)) {
            return true;
        }
        return false;
    }
}

