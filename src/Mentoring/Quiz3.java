package Mentoring;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        // ORNEK SORU2 : Trafikte seyir halindeki kullanıcıdan trafik
        // ışıklarından hangisinin yandığı bilgisini alıp
        // yönlendirme yapan programı yazınız.

        Scanner read = new Scanner(System.in);
        System.out.print("Hangi ışık yanıyor? = ");
        String renk = read.nextLine();

        if (renk.equalsIgnoreCase("Kırmızı"))
            System.out.println("Dur");
        else

            if (renk.equalsIgnoreCase("Sarı"))
                System.out.println("Hazırlan");
        else

            if (renk.equalsIgnoreCase("Yeşil"))
                System.out.println("Geç");
            else
                System.out.println("Sadece kırmızı, sarı ve yeşil renk giriniz.");

    }
}
