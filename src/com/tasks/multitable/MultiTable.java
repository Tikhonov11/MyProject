package com.tasks.multitable;

public class MultiTable {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        while (x != 11) {
            while (y != 11) {
                System.out.print(x * y + " ");
                y++;
            }
            System.out.println();
            x++;
            y = 1;
        }
    }
}
