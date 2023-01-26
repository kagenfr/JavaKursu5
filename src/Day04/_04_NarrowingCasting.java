package Day04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;

        sayi=(int) oran;
        //tehlikeli işlem yapıyorsun, bundan dolayı challenger patladı.
        //değerlere bak, eğer oluşan veri kaybını anladıysan ve kabul ediyorsan
        //bana bunu bilerek yaptığını göster.

        System.out.println("sayi = " + sayi);
        /***********************************************************/

        byte kisaKenar=5;
        byte uzunKenar=7;

        byte cevre= (byte)(kisaKenar+uzunKenar+kisaKenar+uzunKenar);
                //sen eşitliğin 2. tarafı rakamlar toplandı, benim toplam burada INT durumunda
                //byte = cevre 5+5+7+7;  //int'i -> byte'a atmaya çalışıyorsun.
                //eğer veri kaybı olmayacağından eminsen, veya veri kaybı önemli değilse
                //bana bunu yazarak göster.
        int cevre2= kisaKenar+uzunKenar+kisaKenar+uzunKenar;
        System.out.println("cevre = " + cevre);
        //eğer byte yerine int olarak tanımlasaydık bu örnekteki gibi hiçbir sorun olmazdı
        //yukarıda byte olarak yaptığımız için ekstra (byte) yazmamız gerekti (satır 19)
    }
}
