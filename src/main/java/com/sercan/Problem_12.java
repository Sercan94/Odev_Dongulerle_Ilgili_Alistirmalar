package com.sercan;

import java.util.Scanner;

public class Problem_12 {
    public static void main(String[] args) {
        /**
         *      Kullanıcıdan bir sayı alın ve bu sayının faktöriyelini hesaplayın
         */
        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi=new Scanner(System.in).nextInt();
        int faktoriyel=1; // 1 çarpımda etkisiz eleman olduğu için 1 atanmıştır.
        for (int i=1;i<=sayi;i++){
            faktoriyel*=i;
        }
        System.out.println(faktoriyel);

    }

}
