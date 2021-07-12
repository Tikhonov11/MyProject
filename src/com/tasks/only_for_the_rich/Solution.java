package com.tasks.only_for_the_rich;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/*
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("Donald", 800);
        mapa.put("Second", 1000);
        mapa.put("Stalone", 200);
        mapa.put("Rafael", 10000);
        mapa.put("Sigal", 100);
        mapa.put("Trump", 300);
        mapa.put("Jo-jo", 10000);
        mapa.put("Jo", 5000);
        mapa.put("Brocker", 100);
        mapa.put("Kat", 2000);

        return mapa;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> map2 = new HashMap<>(map);
        for (Map.Entry<String, Integer> iterator : map2.entrySet()) {
            String key = iterator.getKey();
            int value = iterator.getValue();
            if (value < 500) map.remove(key);
        }
    }

    public static void main(String[] args) throws IOException {

    }
}
