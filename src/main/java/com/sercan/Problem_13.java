package com.sercan;

import java.util.Scanner;

public class Problem_13 {
    public static void main(String[] args) {
        /**
         *      Kullanıcıdan bir sayı alın ve
         *      bu sayının asal olup olmadığını kontrol eden bir program yazın.
         *
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : "); //11
        int sayi=sc.nextInt();
        boolean sayiAsalmi=false;
        for (int i=2;i<sayi;i++){
            if (sayi%i==0){
                sayiAsalmi=false;
                break;
            }else sayiAsalmi=true;
        }
        if (sayiAsalmi){
            System.out.println("Girdiğiniz sayı asaldır");
        }else System.out.println("Girdiğiniz sayı asal değildir.");
    }
}
