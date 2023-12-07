package com.javaprogram;

public class TugasSegitiga {
    public static void main(String[] args) {

        for (int i = 1; i <= 2 * 5 - 1; i++) {
            int batas;
            if (i <= 5) {
                batas = i;
            } else {
                batas = 2 * 5 - i;
            }

            for (int j = 1; j <= batas; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
