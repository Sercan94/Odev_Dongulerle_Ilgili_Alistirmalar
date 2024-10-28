package com.sercan;

import java.util.Scanner;

public class Problem_14 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir sayı alın ve
         * bu sayıya kadar olan çift sayıları ekrana yazdıran bir program yazın.
         */
        System.out.print("Lütfen bir sayı giriniz :");
        int sayi=new Scanner(System.in).nextInt();
        for (int i=0;i<=sayi;i++) {
            if (i % 2 == 0)
                System.out.println(i);
            //System.out.print(i+",");
        }
    }
}
