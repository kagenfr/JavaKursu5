package Day12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        //Daha önce çözdüğünüz hesap makinesi sorusunu switch yöntemi ile çözünüz.

        Scanner read = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi1 = read.nextInt();

        System.out.print("Sayı giriniz = ");
        int sayi2 = read.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");
        System.out.print("Seçiminiz = ");

        Scanner readStr = new Scanner(System.in);
        String secim = readStr.next();

        switch (secim.toUpperCase()){
            case "T":  System.out.println("toplamı = " + (sayi1+sayi2)); break;
            case "Ç":  System.out.println("farkı = " + (sayi1-sayi2)); break;
            case "P":  System.out.println("çarpımı = " + (sayi1*sayi2)); break;
            case "B":  System.out.println("bölümü = " + ((double)sayi1/sayi2)); break;
            default: System.out.println("Hatalı değer");
        }

    }
}
