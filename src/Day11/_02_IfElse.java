package Day11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Otopark ücretleri : 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 saatten büyükse 20 tl  dir.
        // kullanıcıdan kaç saat kaldığını alarak ücreti yazdırınız

        Scanner read = new Scanner(System.in);
        System.out.print("Kaç saat = ");
        int kacSaat = read.nextInt();

        if (kacSaat <= 3)
            System.out.println("10 €");
        else

            if (kacSaat <= 5)
                System.out.println("15 €");
            else
                System.out.println("20 €");




    }
}
