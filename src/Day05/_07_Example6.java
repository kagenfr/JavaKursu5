package Day05;

import java.util.Scanner;

public class _07_Example6 {
    public static void main(String[] args) {
        //Bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan isteyip çevresi ve alanını bulup yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("Kısa Kenar=");
        int kisaKenar = oku.nextInt();

        System.out.print("Uzun Kenar=");
        int uzunKenar = oku.nextInt();

        int cevre = kisaKenar + uzunKenar + kisaKenar + uzunKenar;
        int alan = kisaKenar * uzunKenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
