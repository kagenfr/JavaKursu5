package Day09;


import java.util.Scanner;

public class _03_Java_If {
    public static void main(String[] args) {
        //Girilen iki sayıdan büyük olanının değerini ekrana yazdınız.
        Scanner read = new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi1 = read.nextInt();

        System.out.print("Sayı giriniz=");
        int sayi2 = read.nextInt();

        if (sayi1 > sayi2)
            System.out.println("İlk sayı büyük" + " " + sayi1);

        if (sayi2 > sayi1)
            System.out.println("İkinci sayı büyük" + " " + sayi2);

        if (sayi1 == sayi2)
            System.out.println("Sayılar eşit");
    }
}
