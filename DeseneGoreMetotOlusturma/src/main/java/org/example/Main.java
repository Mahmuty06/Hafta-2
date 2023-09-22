import java.util.Scanner;
public class Main {
    public static void desen(int n1, int n2) {
        System.out.print(n1 + " ");

        if (n1 <= 0) {
            return;
        }

        if (n1 > 0 && n1 <= n2) {
            desen(n1 - 5, n2);
        } else {
            desen(n1 + 5, n2);
        }

        System.out.print(n1+ " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Desen sayısı girin : ");
        int n = input.nextInt();
        desen(n, n);
    }
}