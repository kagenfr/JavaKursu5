package Day28._04_Constructor;

public class banka {
    String adi;
    int subeSayisi;
    int kurulusYili;
    public banka() {
    }
    public banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }
    public banka(String adi, int kurulusYili) {
        this.adi = adi;
        this.kurulusYili = kurulusYili;
    }
    public String toString() {
        return "banka{" +
                "adi='" + adi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}
