package Day30.StaticVariables._01_Example;

public class Ogrenci {
    String ad;
    String soyad;

    static String okulAd = "Yıldırım İlkokulu";
    //sen birtanesin
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tüm nesneler iöin kullanılacak
    //değişkenler için STATIC kullanıyoruz
    //static = sen birtanesin
    //static varsa hafızadan tasarruf sağlar
    //hepsine atanır, tek olarak hafızada bulunur
    //tipin, sınıfın, class'ın değişkeni oldu.
    public Ogrenci(String ad, String soyad){
        this.ad = ad;
        this.soyad = soyad;

    }

    @Override
    public String toString() {
        return "Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAd = " + okulAd + '\'' +
                '}';
    }
}
