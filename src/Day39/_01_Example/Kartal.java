package Day39._01_Example;

public class Kartal extends Hayvan {


    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Et");
    }

    @Override
    void yemekMiktari() {
        System.out.println("Günlük 1 kg");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("Günde 8 saat");
    }

    @Override
    void sesi() {
        System.out.println("Fiyuu");
    }
}
