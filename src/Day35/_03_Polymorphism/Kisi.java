package Day35._03_Polymorphism;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;


    public Kisi(String ad, String soyad, String gorevi) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorevi = gorevi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }
    public static void kimlikYaz(Kisi gelenKisi){
        System.out.println("\n******* Kimlik Belgesi *******\n");
        System.out.println("Adı = " + gelenKisi.getAd());
        System.out.println("Soyadı = " + gelenKisi.getSoyad());
        System.out.println("Görevi = " + gelenKisi.getGorevi());

        if (gelenKisi instanceof Ogrenci)
            System.out.println("Şubesi: " + ((Ogrenci)gelenKisi).getSubesi());
        else
        if (gelenKisi instanceof Calisan)
            System.out.println("Departmanı: " + ((Calisan)gelenKisi).getDepartmani());


    }
}
