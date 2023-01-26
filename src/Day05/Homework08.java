package Day05;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Do you have a bank account? =");

        boolean haveBankAccount = read.hasNext();

        System.out.println("haveBankAccount = " + haveBankAccount);
    }
}
