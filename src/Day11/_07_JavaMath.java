package Day11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        //Math.max yöntemi ile girilen 3 sayıdan büyük olanı bulunuz.

        Scanner read = new Scanner(System.in);
        System.out.print("a değeri = ");
        int a = read.nextInt();

        System.out.print("b değeri = ");
        int b = read.nextInt();

        System.out.print("c değeri = ");
        int c = read.nextInt();
        
        //1. yöntem
        int enb = Math.max(a,b);
        enb = Math.max(enb,c);
        System.out.println("enb = " + enb);
        
        //2. yöntem
        int enb2 = Math.max(a, Math.max(b,c));
        System.out.println("enb2 = " + enb2);
    }
}
