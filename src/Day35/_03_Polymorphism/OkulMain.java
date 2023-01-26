package Day35._03_Polymorphism;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("Etka", "Bilgen", "Öğrenci", 5);
        Calisan cal1 = new Calisan("Emir", "Bilgen", "Yazılım", "BIM");

        Kisi.kimlikYaz(ogr1);
        Kisi.kimlikYaz(cal1);

    }
}
