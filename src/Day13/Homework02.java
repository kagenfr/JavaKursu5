package Day13;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
       //2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz

        Scanner read = new Scanner(System.in);

        int i = 1;
        int toplam = 0;

        while (i < 20){
            System.out.print(i + ".Sayı giriniz = ");
            int tekSayi = read.nextInt();
            
            if (tekSayi%2 != 0)
                toplam= tekSayi  + i;
            i++;
            
        }
        System.out.println("toplam = " + toplam);
    }
}
