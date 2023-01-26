package Day13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner read = new Scanner(System.in);

        String okunan = "";

        do {
            System.out.print("İfade giriniz = ");
            okunan = read.next();

            if (!okunan.equalsIgnoreCase("x"))
            System.out.println("Program Çalışıyor");

        }while (!okunan.equalsIgnoreCase("x"));
        System.out.println("Program Bitti");
    }
}
