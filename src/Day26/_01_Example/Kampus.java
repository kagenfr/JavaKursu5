package Day26._01_Example;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.

        Ogrenci ogr = new Ogrenci();
        ogr.okulNO = 1;
        ogr.tamAd = "Etka Bilgen";

        //1.yöntem
        ogr.okulu = new Okul();
        ogr.okulu.adi = "Jean Claude Bernard";
        ogr.okulu.mudurAdi = "Jeremy Bono";
        ogr.okulu.ucreti = 28999;

        //2.yöntem
        Okul ok = new Okul();
        ok.adi = "Jean Claude Bernard";
        ok.mudurAdi = "Jeremy Bono";
        ok.ucreti = 28999;

        System.out.println("Okul No = " + ogr.okulNO);
        System.out.println("Adı = " + ogr.tamAd);
        System.out.println("Okul adı = " + ogr.okulu.adi);
        System.out.println("Müdür adı = " + ogr.okulu.mudurAdi);
        System.out.println("Okul ücreti = " + ogr.okulu.ucreti+"€");
    }
}
