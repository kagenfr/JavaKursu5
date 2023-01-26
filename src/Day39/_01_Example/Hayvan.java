package Day39._01_Example;

public abstract class Hayvan {
    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;

    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    private static int idSayac = 1;
    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        this.id = idSayac++;
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
    }

    public int getId() {
        return id;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.print("Yiyeceği = "); yiyecegi();
        System.out.print("Yemek Miktarı = "); yemekMiktari();
        System.out.print("Uyku Süresi = "); gunlukUykuSuresi();
        System.out.print("Sesi = "); sesi();

        return "ID = " + id +
                ", İsim = " + isim +
                ", Vahşi mi = " + vahsi +
                ", Doğum Tarihi = " + dogumTarihi;
    }
}
