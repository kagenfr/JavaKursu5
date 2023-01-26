package Day30.FinalVariables.Example2;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatteki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.

        int gun = 0;
        int saat = 0;
        int dakika = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Gün = "); gun = scanner.nextInt();
        System.out.print("Saat = "); saat = scanner.nextInt();
        System.out.print("Dakika = "); dakika = scanner.nextInt();

        //1.yöntem
        int toplamSaniye = gun*Sabitler.saat*Sabitler.dakika*Sabitler.saniye + saat*Sabitler.dakika
                *Sabitler.saniye + dakika*Sabitler.saniye;
        System.out.println("toplamSaniye = " + toplamSaniye);

        //2.yöntem
        System.out.println("toplamSaniye = " + Sabitler.hesapla(gun,saat,dakika));





    }
}
