package Day32._01_Encapsulation;

public class Person {
    private String ad;
    private String soyad;
    private int yas;

    void yasAta(int yas) {
        if (yas > 0 && yas < 150)
            this.yas = yas;
        else
            System.out.println("hatalı yaş");

    }

    int yasVer() {
        return this.yas;
    }

    void setAd(String ad) {
        if (ad.length() < 25)
            this.ad = ad;
        else
            System.out.println("hatalı ad");
    }

    String getAd() {
        return this.ad;
    }

    void setSoyad(String soyad) {
        if (soyad.length() < 25)
            this.soyad = soyad;
        else
            System.out.println("hatalı soyad");
    }

    String getSoyad() {
        return this.soyad;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
