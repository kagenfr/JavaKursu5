package Mentoring;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        String userName = "TechnoStudy";
        String password = "12345";

        // ORNEK SORU : Yukarıdaki kayıtlı bilgilere göre kullanıcıdan, kullanıcı adı ve şifre alarak
        // 4 farklı opsiyon için login işlemlerini yazınız.

        // 1.opsiyon - kullanıcı adı ve şifre hatalı
        // 2.opsiyon - şifre hatalı
        // 3.opsiyon - kullanıcı adı hatalı
        // 4.opsiyon - sisteme giriş başarılı.

        Scanner read = new Scanner(System.in);

        System.out.print("Kullanıcı adı = ");
        String kullaniciAdi = read.nextLine();

        System.out.print("şifre = ");
        String passWord = read.nextLine();


        if (!(userName.equals(kullaniciAdi)) && !(password.equals(password))){
            System.out.println("kullanıcı adı ve şifre hatalı");
        }
        else
        if ((userName.equals(kullaniciAdi)) && !(password.equals(password))){
            System.out.println(" şifre hatalı");
        }
        else
        if (!(userName.equals(kullaniciAdi)) && (password.equals(password))){
            System.out.println(" kullanıcı adı hatalı");
        }
        else {
            System.out.println("Basarili");
        }


    }
}
