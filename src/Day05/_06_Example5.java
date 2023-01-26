package Day05;

import java.util.Scanner;

public class _06_Example5 {
    public static void main(String[] args) {
        //Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("Kare'nin bir kenar uzunluğu=");
        int kenar= oku.nextInt();

        int cevre= kenar+kenar+kenar+kenar;
        int alan= kenar*kenar;


        System.out.println("cevre= " + cevre);
        System.out.println("alan = " + alan);


    }
}
