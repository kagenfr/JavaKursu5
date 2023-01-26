package Day14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner read = new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle = read.nextLine();

        for(int i = 0; i < cumle.length(); i++){

            if (cumle.charAt(i)==' ')
                continue;

            System.out.println(cumle.charAt(i));



        }


    }
}
