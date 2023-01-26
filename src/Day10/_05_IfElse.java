package Day10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.

        Scanner read = new Scanner(System.in);
        System.out.print("Cümle giriniz = ");
        String cumle = read.nextLine();


        if (cumle.length() > 10 && cumle.toLowerCase().contains("study"))
            System.out.println("evet");

        else
            System.out.println("hayır");
    }
}
