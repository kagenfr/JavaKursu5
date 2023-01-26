package Day17;

import java.util.Arrays;

public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {
        String[] isimler = {"ahmet","zeynep","roman","yazsin","cihan"};

        //diziyi string olarak direkt yazdırır.
        System.out.println("isimler = " + Arrays.toString(isimler)); //[ahmet, zeynep, roman, yazsin, cihan]

        //dizi sıralama
        Arrays.sort(isimler);
        System.out.println("isimler = " +Arrays.toString(isimler)); //[ahmet, cihan, roman, yazsin, zeynep]

        //diziler eşit mi?
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); //true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); //false
        
        Arrays.sort(c); //sayı bazlı dizi sıralaması
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c)); //[1, 2, 8, 54]
        
        //contains gibi çalışır, var ise pozitif bir değer döndürür, yok ise negatif
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b,3)); //-2
        Arrays.sort(b);
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b,3)); //1


    }
}
