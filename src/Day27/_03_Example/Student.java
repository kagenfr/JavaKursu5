package Day27._03_Example;

import java.util.ArrayList;

public class Student {
    String stdntName;
    int maxSaat;
    ArrayList<Lesson> dersleri = new ArrayList<>();

    public void dersEkle(Lesson ders) {

        int suAnToplamSaat = 0;
        for (Lesson d : dersleri)
            suAnToplamSaat += d.time;

        if (suAnToplamSaat + ders.time <= maxSaat)
            dersleri.add(ders);
        else
            System.out.println(ders.name + ": Kredi Sınırı Aşıldı! Yeni ders eklenememektedir. " +
                    "Eklenemeyen ders:" + " " + ders.name);

    }
    public void dersleriYazdir(){
        System.out.println("\n*** Transkript ***");
        System.out.println("Sayın " +stdntName);
        System.out.println("Aldığınız dersler;");
        for (Lesson d: dersleri)
            System.out.println(d.name+" "+d.time);

    }


}
