
import java.util.Scanner;

public class Main {
    static boolean asalSayi(int sayi, int bolen) {
        if (sayi <= 1) {
            return false;
        }
        if (bolen == 1) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return asalSayi(sayi, bolen - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        boolean asaled = asalSayi(number, number / 2 );
        if (asaled) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
    }
    }