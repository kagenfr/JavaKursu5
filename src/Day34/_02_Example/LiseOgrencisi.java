package Day34._02_Example;

public class LiseOgrencisi extends Ogrenci {
    private String brans;

    public LiseOgrencisi(String isim, OgrTip tipi, String brans) {
        super(isim, tipi);
        setBrans(brans);
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "LiseOgrencisi{" +
                "brans='" + brans + '\'' +
                "} " + super.toString();
    }
}
