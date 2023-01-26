package Day38._01_Abstract;
//1 interface + 1 parent class = abstract class
public abstract class BinekOto {
    private String marka;
    private int uretimYili;
    private int vitesAdedi;

    public BinekOto(String marka, int uretimYili, int vitesAdedi) {
        this.marka = marka;
        this.uretimYili = uretimYili;
        this.vitesAdedi = vitesAdedi;
    }
    abstract int HizlanmaSuresi();


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }

    @Override
    public String toString() {
        return "BinekOto {" +
                "Marka = '" + marka + '\'' +
                ", Üretim Yılı = " + uretimYili +
                ", Vites Adedi = " + vitesAdedi +
                '}';
    }
}
