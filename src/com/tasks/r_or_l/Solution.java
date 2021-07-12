package com.tasks.r_or_l;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("land");
        strings.add("relax");
        strings.add("delete");
        strings.add("rampage");
        strings.add("nirvana");
        strings.add("perkele");
        fix(strings);

        for (String x : strings) {
            System.out.println(x);
        }
    }

    public static void fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ) {
            String x = list.get(i);

            if (x.contains("r") && (x.contains("l"))) {
                i++;
            } else if (x.contains("r")) {
                list.add(i, list.get(i));
                i += 2;
            } else if (x.contains("l")) {
                list.remove(list.get(i));
            } else {
                i++;
            }
        }
    }
}





