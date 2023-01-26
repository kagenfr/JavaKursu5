package Day08;

import java.util.Scanner;

public class _07_Question2 {
    public static void main(String[] args) {
        //Kullanıcın gireceği 2 sayının birbirine eşit mi olup olmadığını yazdırınız.

        Scanner read = new Scanner(System.in);

        System.out.print("Birinci sayı = ");
        int sayi1 = read.nextInt();

        System.out.print("İkinci sayı = ");
        int sayi2 = read.nextInt();

        System.out.println("Eşit mi ?  = " + (sayi1 == sayi2));

        //2. yöntem
        boolean esitMi = (sayi1 == sayi2);
        System.out.println("esitMi = " + esitMi);

    }
}
