package Day14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        //Kullanıcının gireceği bir rakama(girilen rakam dahil) kadar olan sayıların toplamını bulunuz.

        Scanner read = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi = read.nextInt();

        int toplam = 0;
        for (int i=1; i <=sayi; i++)
            toplam+= i;

        System.out.println("toplam = " + toplam);

    }
}
