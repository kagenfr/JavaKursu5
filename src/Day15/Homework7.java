package Day15;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        //Uzunluk ve genişliğini yazan kişinin belirlediği # bütünü oluşturabileceğiniz bir kod yazınız.

        //örn:
        //length(uzunluk): 7
        //width(genişlik): 5

        //Output:
        //#####
        //#####
        //#####
        //#####
        //#####
        //#####
        //#####

        Scanner read = new Scanner(System.in);
        System.out.print("Uzunluk = ");
        int uzunluk = read.nextInt();

        System.out.print("Genişlik = ");
        int genislik = read.nextInt();

    for (int j = 1; j <=uzunluk; j++){

        for (int i = 1; i <=genislik; i++)

            System.out.print("#");

        System.out.println();
        }














    }
}
