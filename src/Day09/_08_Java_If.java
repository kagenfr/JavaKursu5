package Day09;

import java.util.Scanner;

public class _08_Java_If {
    public static void main(String[] args) {
        //Kullanıcın 2 kez gireceği şifresinin aynı olduğunu AYNI veya DEĞİL şeklinde cevaplayınız.

        Scanner read = new Scanner(System.in);

        System.out.print("Şifrenizi giriniz= ");
        String password = read.nextLine();

        System.out.print("Şifrenizi tekrar giriniz= ");
        String againPassword = read.nextLine();

        boolean ayniMi = password.equals(againPassword);

        if (ayniMi)
            System.out.println("AYNI");

        if (!ayniMi)
            System.out.println("DEĞİL");


    }
}
