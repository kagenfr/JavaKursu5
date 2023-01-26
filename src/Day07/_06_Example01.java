package Day07;

import java.util.Scanner;

public class _06_Example01 {
    public static void main(String[] args) {
        //Tek seferde girilen bir ad soyadın (tam ad)
        // adını ve soyadını ayırıp ayrı ayrı yazdırınız.(sadece ad ve soyad)

        Scanner read = new Scanner(System.in);

        System.out.print("Adınız ve Soyadınız= ");
        String adSoyad = read.nextLine();

        //Etka Bilgen
        //ad: 0, boşluğun indexine kadar
        //soyad: bosluk+1, sonuna kadar

        int boslukIndex = adSoyad.indexOf(" ");
        String ad = adSoyad.substring(0, boslukIndex);
        String soyad = adSoyad.substring(boslukIndex + 1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
    }
}
