package Day13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        //Girilen 20 sayıdan sadece pozitif olanlarının toplamını bulunuz.

        Scanner read = new Scanner(System.in);

        int sayac = 0;
        int toplam = 0;


        while (sayac<5) {
            System.out.print(sayac + ".Sayı Giriniz = ");
            int sayi = read.nextInt();
            
            if (sayi > 0)
                toplam = toplam + sayi;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    
    }
    
}
