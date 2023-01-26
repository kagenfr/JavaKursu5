package Day03;

public class _07_JavaString {
    public static void main(String[] args) {
        String ad="Etka";  // String: kelime veya kelimeleri saklamak için kullanılır
                           // sınırları "" ile belirlenir

        String soyad="Bilgen";

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ad ve soyad = " +ad+" "+soyad);

        // + lar burada stringler arasında olanı birleştirir.

        String tamAd = "etka" +" "+ "bilgen";
        System.out.println("tamAd = " + tamAd);


    }
}
