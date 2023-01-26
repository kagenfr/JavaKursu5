package Day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);
        System.out.println("sayilar = " + sayilar);

        //Sıralama işlemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        //tersine çevirme
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        //max ve min eleman bulma
        System.out.println("max() = " + Collections.max(sayilar));
        System.out.println("min() = " + Collections.min(sayilar));

        //bütün elemanları set etme
        Collections.fill(sayilar,0);
        System.out.println("sayilar = " + sayilar);
        
        //replace
        Collections.replaceAll(sayilar,0,5);
        System.out.println("sayilar = " + sayilar);

        //tanımlarken değer atama
        int[] dizi = {2,3,4,5};
        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(3,4,5,6));
        ArrayList<String> strListe = new ArrayList<>(Arrays.asList("ahmet","mehmet","büşra","roman"));

        System.out.println("liste = " + liste);
        System.out.println("strListe = " + strListe);

        ArrayList<Integer> liste2 = new ArrayList<>();
        Collections.addAll(liste2,2,3,4,5,6,7);
        System.out.println("liste2 = " + liste2);

        //diziyi direkt ArrayList e nasıl atarım
        Integer[] dizi2 = {2,3,4,5};
        ArrayList<Integer> liste3 = new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("liste3 = " + liste3);




        
    }
}
