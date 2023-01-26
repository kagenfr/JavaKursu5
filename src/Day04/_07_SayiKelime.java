package Day04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        //sayıları birbirine çevirdik
        //yazıların rakamlara çevrilmesi, rakamların yazıya çevrilmesi

        String ad="etka";
        String kelimeSayi="65";  //string halde, toplama gibi bir işleme giremez

        int sayiDeger= Integer.parseInt(kelimeSayi);  //sayıya dönüşür

        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        //toplam şu anda int yani sayı, bunu String nasıl dönüştürürüm
        String strToplam= Integer.toString(toplam); //String e dönüştürür
        System.out.println("strToplam = " + strToplam);
    }
}
