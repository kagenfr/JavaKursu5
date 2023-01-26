package Day41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringLocalDateAndTimeParse {
    public static void main(String[] args) {
        //Kullanıcıdan alınan ve String durumundaki Time veya Date 
        //bilgisinin Time veya Tarih bilgisine çevrilmesi.

        long startTime = System.currentTimeMillis(); //kodun performansı için

        Scanner scanner = new Scanner(System.in);
        System.out.print("Tarih Giriniz = ");
        String strTarih = scanner.nextLine();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate tarih = LocalDate.parse(strTarih,f);
        System.out.println("tarih = " + tarih);

        long finishTime = System.currentTimeMillis();
        System.out.println("gecenSure = " + (finishTime-startTime) + " ms");

    }
}
