package Day30.StaticVariables._01_Example;

public class Okul {
    public static void main(String[] args) {


        Ogrenci st1 = new Ogrenci("Etka", "Bilgen");
        System.out.println("st1 = " + st1);

        Ogrenci.okulAd = "Atatürk İlkokulu";
        System.out.println("st1 tekrar = " + st1);

        //Aynı verinin çok kez girişi engellendi
        //Aynı verinin hafızada NESNE sayısı kadar tekrarlanması engellendi

        Ogrenci st2 = new Ogrenci("Ali","Yıldırım");
        System.out.println("st2 = " + st2);
    }
}
