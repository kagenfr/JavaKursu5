package Day04;

public class _02_TypeCasting {
    public static void main(String[] args)       {
        byte ogrNot1=98;
        byte ogrNot2=98;
        byte ogrNot3=100;
        byte ogrNot4=98;

        int toplam= ogrNot1; //byte -> int atınca problem çıkmadı  (GENİŞLETME -- WIDENING)
                             //çünkü byte için hafızada ayrılan, zaten int e sığar, sığdığı için kabul eder.
                             //çünkü veri kaybı olma ihtimali hiç yok.

        ogrNot1= (byte)toplam; // int -> byte atınca olmadı  (DARALTMA -- NARROW CASTING)
                               // büyük hafıza ayrılmış bir alanı, küçük hafıza ayrılmış alana atma işlemi var.
                               // veri kaybı ihtimali var.
    }
}
