package Day10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner read = new Scanner(System.in);
        System.out.print("Password giriniz = ");
        String passWord = read.nextLine();

        //1. yöntem
        int uzunluk = passWord.length();
        boolean varMi = passWord.toLowerCase().contains("pass");

        if (uzunluk >= 8 && uzunluk <= 12 && varMi ==false)
            System.out.println("uygun");
        else
            System.out.println("uygun değil");

        //2. yöntem
        if (passWord.length() >= 8 && passWord.length() <=12 && passWord.toLowerCase().contains("pass")==false)
            System.out.println("uygun");
        else
            System.out.println("uygun değil");

        //3. yöntem
        if (passWord.length() >= 8 && passWord.length() <=12 && !passWord.toLowerCase().contains("pass"))
            System.out.println("uygun");
        else
            System.out.println("uygun değil");


    }
}
