package Day22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi = 5; //tek bir rakam tutabilen bir değişken
        int[] dizi = new int[20]; //20 adet sayı tutabilen bir değişken, uzunluğu sabit
        int[][] tablo = new int[20][2]; //20x2 lik sayı saklayabilen değişken, uzunluğu sabit

        ArrayList<Integer> liste = new ArrayList<>(); //istenildiği kadar sayı eklenebilen, uzunluğu değişken
        /******************************/

        //bir sınıfta 20 kişi var ve bunların 3 dersi olsun. öğrencilerin bu 3 derse ait notlarını
        //nasıl bir değişkende saklayabilirim.

        ArrayList<Integer> matNotlari = new ArrayList<>();
        ArrayList<Integer> fizNotlari = new ArrayList<>();
        ArrayList<Integer> kimNotlari = new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        //ArrayList in ArrayList i ni nasıl yaparım
        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

        notlarListesi.get(0); //-> matNotlari

        int matBirNot = notlarListesi.get(0).get(0); // mat notlarının ilkini aldım
        System.out.println("matBirNot = " + matBirNot);

        int kimDortnot = notlarListesi.get(2).get(3); //kimya notlarının dördüncüsünü aldım
        System.out.println("kimDortnot = " + kimDortnot);

        int fizIkiNot = notlarListesi.get(1).get(1); //fizik notlarının ikincisini aldım
        System.out.println("fizIkiNot = " + fizIkiNot);

        System.out.println("notlarListesi(0) = " + notlarListesi.get(0)); //mat notları
        System.out.println("notlarListesi(1) = " + notlarListesi.get(1)); //fizik notları
        System.out.println("notlarListesi(2) = " + notlarListesi.get(2)); //kimya notları

        //yukarıdakinin yerine bir for döngüsü nasıl kullanırız
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println("notlarListesi.get(" + i + ") = " + notlarListesi.get(i));
        }
        for (int i = 0; i < notlarListesi.size(); i++) {

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(notlarListesi.get(i).get(j) + "\t");


            }
            System.out.println();

        }
    }



}
