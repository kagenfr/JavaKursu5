package Day05;

import java.util.Scanner;

public class _03_Example2 {
    public static void main(String[] args) {
        //Kullanıcıdan adını ve soyadını ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);    //okuma işlemini yapacak olan değişken tanımlandı.
        System.out.print(" adınız ve soyadınız=");  //ekrana neyin girileceğini yazdık bilgilendirdik
        String adSoyad = oku.nextLine();  //okuma işlemi bu noktada yapılıyor


        System.out.println("adSoyad = " + adSoyad); //verinin gerçekten okunabildiğini
                                                    //tekrar ekrana yazarak kontrol ettim.


    }
}
