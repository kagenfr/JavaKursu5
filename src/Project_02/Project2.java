package Project_02;
//Buradaki hatayı bulabilir misin?
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        List<String> actions = new ArrayList<>(Arrays.asList("1-Para Yatırma", "2-Para Çekme", "3-Transfer", "4-Çıkış"));
        List<String> userNames = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));
        List<String> passwords = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));
        List<String> accountNumbers = new ArrayList<>(Arrays.asList("1234", "5678", "9999"));
        List<Integer> amounts = new ArrayList<>(Arrays.asList(200, 1000, 5000));

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Kullanıcı adı: ");
            String inputUsername = scan.nextLine();
            System.out.print("Şifre: ");
            String inputPassword = scan.nextLine();

            if (confirmUsernameAndPassword(inputUsername, inputPassword, userNames, passwords)) {
                System.out.println("Başarılı bir şekilde giriş yaptınız.");

            }
            while (true) {
                System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
                for (int i = 0; i < actions.size(); i++) {
                    System.out.println(actions.get(i) + " - " + (i + 1));
                }

                int userChoice = scan.nextInt();
                switch (userChoice) {
                    case 1: {
                        System.out.println("Bu bankamatik geçici olarak para yatırma işlemine kapalıdır. Üzgünüz.");
                        break;
                    }
                    case 2: {
                        System.out.println("Hangi hesaptan para çekmek istiyorsunuz?");
                        for (int i = 0; i < accountNumbers.size(); i++) {
                            System.out.println(accountNumbers.get(i));
                        }
                        String chosenAccountNumber = scan.nextLine();
                        System.out.println("Ne kadar para çekmek istiyorsunuz?");
                        int amount = scan.nextInt();
                        withdraw (chosenAccountNumber, amount, accountNumbers, amounts);
                        break;
                    }
                    case 3: {
                        System.out.println("Bu işlemi şu an gerçekleştiremiyoruz.");
                        break;
                    }
                    case 4:
                        System.exit(1);
                    default: {
                        System.out.println("Başarılı bir seçim yapmadınız.");
                        break;
                    }
                }
            }

        }
    }
    private static void withdraw(String chosenAccount, int amountToWithdraw, List<String> accounts, List<Integer> funds) {
        int index = accounts.indexOf(chosenAccount);

        if (index == -1) {
            return;
        } if (funds.get(index) < amountToWithdraw) {
            System.out.println("Beklenmedik bir hata oluştu... İyi günler dileriz...");
            return;
        }

        funds.set(index, funds.get(index) - amountToWithdraw);

        System.out.println(chosenAccount + " numaralı hesabınızdan " + amountToWithdraw + "TL çekildi. Hesabınızda kalan para miktarı: " + funds.get(index));


    }
    public static boolean confirmUsernameAndPassword(String inputUsername, String inputPassword, List<String> userNames, List<String> passwords) {
        for (int i = 0; i < userNames.size(); i++) {
            if (inputUsername.equals(userNames.get(i)) && inputPassword.equals(passwords.get(i))) {
                return true;
            }
        }
        return false;
    }

}




