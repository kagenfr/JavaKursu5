package Day14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz.
        //2. bölüm: çarpımın değeri 10.000 i geçtiğinde işlem sonlansın.
        Scanner read = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi = read.nextInt();

        int p = 1;
        for (int i=1; i <= sayi; i++) {
            p = p * i;

            if (p >= 10000) {
                System.out.println("break çalıştı");
                break;
            }
        }
        System.out.println("p = " + p);

    }

}
