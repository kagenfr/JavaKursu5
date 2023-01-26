package Day26._04_Example;

public class EnerjiSA {
    public static void main(String[] args) {
        Musteri musteri = new Musteri("Ahmet");
       musteri.name = "Etka Bilgen";
       musteri.elektrikHesabi = new ElektrikHesabi();
       musteri.elektrikHesabi.tuketimEkle(50);
       musteri.elektrikHesabi.tuketimEkle(60);
       musteri.elektrikHesabi.tuketimEkle(70);
       musteri.elektrikHesabi.toplamTuketimYaz();
       musteri.elektrikHesabi.faturaYaz(musteri.name);

    }
}
