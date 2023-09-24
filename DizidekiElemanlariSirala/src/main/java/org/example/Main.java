import java.util.Arrays;
import java.util.Scanner;
     import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double harmonik = 0.0, sonuc;
        int uzunluk;

        Scanner input = new Scanner(System.in);
        System.out.println("Diziniz Kaç Elemanlı Olsun : ");
        uzunluk = input.nextInt();

        int[] dizi = new int[uzunluk];
        int[] newDizi = new int[uzunluk];
        int mindeger= 0 ;

        for (int i = 0; i < uzunluk; i++) {

            System.out.println((i + 1) +". elemanı giriniz. ");
            dizi[i] = input.nextInt() ;

        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
    }

}