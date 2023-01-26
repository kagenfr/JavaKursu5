package Day06;

import java.util.Scanner;

public class _04_Example02 {
    public static void main(String[] args) {
        //Girilen bir stringin sadece son harfini yazdırınız.

        Scanner read = new Scanner(System.in);

        System.out.print("Bir cümle giriniz=");
        String cumle = read.nextLine();

        //01234 -> harflerin oda numaraları, index
        //bugün -> son harfin oda numarası uzunluğun 1 eksiği
        
        int uzunluk=cumle.length();
        char sonHarf = cumle.charAt(uzunluk-1);

        System.out.println("sonHarf = " + sonHarf);

        //2.yöntem

        System.out.println("son Harf = "+ cumle.charAt(cumle.length() -1 ) );


    }
}
