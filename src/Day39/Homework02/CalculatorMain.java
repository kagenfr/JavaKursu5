package Day39.Homework02;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int a = scanner.nextInt();
        System.out.print("Sayı giriniz = ");
        int b = scanner.nextInt();

        Sum sum = new Sum();
        System.out.println("Toplama işleminin sonucu: " + sum.calculating(a,b));

        Substract substract = new Substract();
        System.out.println("Çıkarma işleminin sonucu: " + substract.calculating(a,b));

        Multiply multiply = new Multiply();
        System.out.println("Çarpma işleminin sonucu: " + multiply.calculating(a,b));

        Divide divide = new Divide();
        System.out.println("Bölme işleminin sonucu: " + divide.calculating(a,b));






    }
}
