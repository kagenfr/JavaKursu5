package Day34._03_Example;

public class IlkOkulOgrencisi extends Ogrenci {
    private String kulup;
    private static int ilkOkulIdSayac=1;
    public IlkOkulOgrencisi(String isim, OgrTip tipi, String kulup) {
        super(isim, tipi,ilkOkulIdSayac++);
        setKulup(kulup);
    }

    public String getKulup() {
        return kulup;
    }

    public void setKulup(String kulup) {
        this.kulup = kulup;
    }

    @Override
    public String toString() {
        return "IlkOkulOgrencisi{" +
                "kulup='" + kulup + '\'' +
                "} " + super.toString();
    }
}
