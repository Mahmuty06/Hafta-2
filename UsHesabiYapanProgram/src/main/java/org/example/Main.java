
import java.util.Scanner;

public class Main {
    static int usHesabi (int tabanDegeri, int usDegeri ) {
       int sonuc ;

        if (usDegeri == 0 ){
            return 1 ;
    }   else {
            usDegeri -- ;
           sonuc =  tabanDegeri * usHesabi(tabanDegeri,usDegeri);

           return sonuc ;
        }
        }
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in) ;
        int tabanDegeri , usDegeri ;

        System.out.println("TABAN DEGERİ GİRİNİZ :");
        tabanDegeri  = input.nextInt() ;

        System.out.println("ÜS DEGERİ GİRİNİZ :");
        usDegeri = input.nextInt() ;

        System.out.println(usHesabi(tabanDegeri, usDegeri));
    }
}