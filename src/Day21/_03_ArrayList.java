package Day21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner readInt = new Scanner(System.in);
        Scanner readStr = new Scanner(System.in);
        ArrayList<Integer> notlar = new ArrayList<>();
        int toplam = 0;
        String devamMi;
        
        do {
            System.out.print("Not = ");
            int not = readInt.nextInt();
            
            notlar.add(not);
            
            toplam = toplam+not;

            System.out.print("devam etmek istiyor musunuz (E/H) = ");
            devamMi = readStr.next();
            
        }while (devamMi.equalsIgnoreCase("E"));
        
        int ort = toplam / notlar.size();
        System.out.println("Not Ortalaması = " + ort);

        int gecenSayisi = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) > ort)

                gecenSayisi++;
        }
        System.out.println("Ortalamayı geçen öğrenci sayısı = " + gecenSayisi);
        
        

    }
}
