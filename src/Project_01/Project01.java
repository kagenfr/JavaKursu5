package Project_01;

import java.util.Scanner;

public class Project01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen adınızı giriniz: ");

        String name = scanner.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println("Hoşgeldin " + name + ", soyadını girer misin?");

        System.out.print("Lütfen soyadınızı giriniz: ");
        String surname = scanner.nextLine();
        surname = surname.substring(0, 1).toUpperCase() + surname.substring(1);

        System.out.println("Adınız ve Soyadınız = " + name + " " + surname);

        while (true) {
            System.out.print("Adınız ve Soyadınız " + name + " " + surname + " olarak kaydedilsin mi? (Y/N): ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                break;
            } else
                System.out.println("Tercihinizi doğru yapmadınız... Lütfen tekrar deneyiniz...");
        }
        System.out.println("Adınız ve soyadınız sisteme başarılı bir şekilde kaydedilmiştir...");

        System.out.print("Lütfen kullanıcı adınızı belirleyiniz: ");
        String nickname = scanner.nextLine();

        System.out.print("Lütfen şifrenizi belirleyiniz: ");
        String password = scanner.nextLine();

        System.out.print("Şifrenizi tekrar giriniz: ");
        String passwordConfirm = scanner.nextLine();

        while (true) {

            if (!password.equals(passwordConfirm)) {
                System.out.println("Hatalı bir şifre girdiniz, lütfen tekrar deneyiniz...");
                passwordConfirm = scanner.nextLine();

            } else {
                System.out.println("Tebrikler... '" + nickname + "' kullanıcı adı ve şifrenizle sisteme kayıt oldunuz...");
                break;
            }

        }
    }
}

