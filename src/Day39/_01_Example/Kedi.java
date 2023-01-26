package Day39._01_Example;

public class Kedi extends Hayvan{


    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Mama");
    }

    @Override
    void yemekMiktari() {
        System.out.println("Günde 50 gram");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("Günde 14 saat");
    }

    @Override
    void sesi() {
        System.out.println("Miyav");
    }
}
