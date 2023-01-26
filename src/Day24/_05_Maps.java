package Day24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Maps {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu seçenekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu seçenekte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu seçenekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        // TODO : geri kalan menu işlemleri yapılacak
        // TODO :  2.Aşama menulerde yapılacak işlemleri METOD ile yapınız.

        Map<String, String> sozluk = new TreeMap<>();


        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        int secim = 0;

        do { //menü çıkacak (1-ekleme, 2-düzeltme, 3-listeleme, 4-arama)
            System.out.println("Menü\n1- Ekleme\n2- Düzeltme\n3- Listeleme\n4- Arama\n5- Silme\n6- Çıkış\n Seçiminiz = ");
            //seçim alınacak
            secim = scInt.nextInt();
            //seçime göre işlem yapılacak
            switch (secim) {
                case 1: //1 i seçti ise ekleme işlemini yap
                    //kelimeyi giriniz
                    System.out.print("Kelime giriniz=");
                    String kelime = scStr.nextLine();
                    // manasını giriniz
                    System.out.print("Manasını yazınız=");
                    String manasi = scStr.nextLine();
                    // buna uygun değişkene ekle
                    sozluk.put(kelime, manasi);
                    break;
                case 2: //2 yi seçti ise düzeltme işlemini yap
                    System.out.println("düzeltme seçildi");
                    break;
            }

        } while (secim != 6); //çıkış olmadığı sürece devam et





    }

}
