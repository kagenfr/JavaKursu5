package Project_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Project02 {
    static int index = 0;

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        ArrayList<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        ArrayList<String> passwords = new ArrayList<>();
        passwords.add("password1"); // 0. index
        passwords.add("password2");
        passwords.add("password3");
        ArrayList<String> accountNo = new ArrayList<>();
        accountNo.add("1234"); // 0. index
        accountNo.add("5678");
        accountNo.add("9999");
        ArrayList<Integer> amounts = new ArrayList<>();
        amounts.add(200); // 0. index
        amounts.add(1000);
        amounts.add(5000);

        String username = "";
        String password = "";

        while (true) {
            System.out.print("Kullanıcı adınızı giriniz = ");
            username = scStr.nextLine();
            System.out.print("Şifrenizi giriniz = ");
            password = scStr.nextLine();

            if (confirmUsernameAndPassword(users, passwords, username, password)) {
                System.out.println("Başarılı bir şekilde giriş yaptınız");
                break;
            } else {
                System.out.println("Sistemde kayıtlı böyle bir kullanıcı bulunamadı, lütfen tekrar deneyiniz");
            }
        }
        int secim = 0;
        while (true) {
            System.out.println("Menü\n1-Para Yatırma\n2-Para Çekme\n3-Transfer\n4-Hesap Aç\n5-Çıkış Yap");
            System.out.print("Seçiminizi yapınız = ");
            secim = scInt.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Bu bankamatik geçici olarak para yatırma işlemine kapalıdır...Üzgünüz");
                    break;
                case 2:
                    for (int i = 0; i < users.size(); i++) { // bu döngüde girilen userin listlerden hangsi ile uyuþtuðunu buluyor
                        if (username.equalsIgnoreCase(users.get(i))) {
                            index = i; // indexi burada tespit edildi.
                            break;
                        } else {
                            System.out.println("Sistemde bir hata oluştu");
                        }
                    }
                    System.out.println("Hesap numaranız = " + accountNo.get(index) + " " + "Bakiyeniz = " + amounts.get(index)+ " ");
                    System.out.print("Miktar giriniz = ");
                    int amount=scInt.nextInt();
                    withdraw(amounts,amount);
                    break;
                case 3:
                    System.out.println("Bu işlemi şu an gerçekleştiremiyoruz.");
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Başarılı bir seçim yapmadınız.");
            }
        }
    }

    public static boolean confirmUsernameAndPassword(ArrayList<String> username, ArrayList<String> password, String user, String sifre) {
        for (int i = 0; i < username.size(); i++) {
            if (user.equalsIgnoreCase(username.get(i)) && sifre.equalsIgnoreCase(password.get(i))) {
                return true;
            }
        }
        return false;
    }
    public static void withdraw(ArrayList<Integer> bakiye, int miktar) {
        if (miktar <= bakiye.get(index)) {
            System.out.print("Kalan para = " + (bakiye.get(index) - miktar));
            System.out.println();
        } else {
            System.out.println("Bakiyeniz yetersiz");
        }
    }
}
