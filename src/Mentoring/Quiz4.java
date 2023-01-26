package Mentoring;

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        // Soru1: kullanicidan bir not girmesini isteyen ve bu nota
        // karsilik gelen harf notunu veren programi yaziniz.

        // Soru2: Girilen bir sayinin haftanin hangi gunune denk geldigini yazdiran bir program yaziniz

        //Soru 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Notu giriniz = ");
        int not = scan.nextInt();

        if (not == 100) {
            System.out.println("A+");
        }else if (not >= 85 && not <= 99) {
            System.out.println("A");
        } else if (not >= 70 && not <= 84) {
            System.out.println("B");
        } else if (not >= 50 && not <= 69) {
            System.out.println("C");
        } else if (not < 50)
            System.out.println("D");

        //Soru 2;

        Scanner read = new Scanner(System.in);
        System.out.print("Day No = ");
        int dayNo = read.nextInt();

        switch (dayNo){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default:System.out.println("Wrong Number");





        }






    }



    }

