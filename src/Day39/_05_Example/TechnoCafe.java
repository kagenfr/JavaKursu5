package Day39._05_Example;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);

        ArrayList<IFood> siparisler=new ArrayList<>();



        int secim;

        int siparis = 0;

        do {
            System.out.print("Menü*\n1-Adana Kebap (55 TL)\n" +
                    "2-Lahmacun (33 TL)\n" +
                    "3-Borsh (33 TL)\n" +
                    "4-Palov (44 TL)\n" +
                    "0-Tamam\n" +
                    "Seçiminiz :");
            secim= okuInt.nextInt();

            switch (secim){
                case 1:
                    AdanaKebap a=new AdanaKebap();
                    siparisler.add(a);
                    siparis++;
                    break;
                case 2:
                    Lahmacun l=new Lahmacun();
                    siparisler.add(l);
                    siparis++;
                    break;
                case 3:
                    Borsh b=new Borsh();
                    siparisler.add(b);
                    siparis++;
                    break;
                case 4:
                    Palov p=new Palov();
                    siparisler.add(p);
                    siparis++;
                    break;
                default:
                    System.out.println("Hatalı seçim.");
                    break;
            }

        }while (secim != 0);

        System.out.println("Alınan Siparişler...");
        for (IFood f : siparisler){
            System.out.println(f.getClass().getSimpleName());

        }

        System.out.println("Siparişler Hazırlanıyor...");
        double toplamucret=0;
        for (IFood f : siparisler){
            TechnoKitchen.hazirla(f);
            toplamucret+=f.ucret();

        }

        System.out.println("Toplam Ucret = " + toplamucret);



    }
}
