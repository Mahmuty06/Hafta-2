package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz :");
        sayi = inp.nextInt();
        System.out.println(asalBulma(sayi));

    }
    static String asalBulma(int sayi){
    int sayac = 0;
    for(int i = 2 ; i <= sayi ; i ++){
    if(sayi % i == 0 ) {
        sayac = sayac + 1;
    }
    }
    if(sayac == 1){
        return "asal";
    }
    else{
        return "asal değil";
    }
    }
    static String asalBulm(int sayi){
        int sayac = 0;
       int deger = sayi;


          if( deger % sayi == 0)
              sayac = sayac+1;
          sayi--;
          asalBulm(sayi);


    }
}