package Day23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        //Ekrana yazdırma çeşitleri
        System.out.println("renkler = " + renkler);

        //foreach ile ekrana yazdırma yöntemi (tek tek ekrana yazdırma)
        for (String eleman: renkler) { //sıra garanti değil.
            System.out.println("eleman = " + eleman);
            
        }
        //foreach ile ilgili örnek olsun diye yapıldı 
        int[] dizi = {34,5,6,7,8,89,899,77};
        for (int sayi : dizi){
            System.out.println("sayi = " + sayi);
        }
        //Iterator komutuyla yazdırma işlemi (Iterator: Yineleyici demek)
        Iterator gosterge = renkler.iterator();
        
        while (gosterge.hasNext()){
            System.out.println("gosterge.next() = " + gosterge.next());
        }
        

    }

}
