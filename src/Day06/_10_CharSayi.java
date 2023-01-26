package Day06;

public class _10_CharSayi {
    public static void main(String[] args) {
        int sayi = 65;

        System.out.println("sayi = " + sayi);

        char harf = (char) sayi;
        System.out.println("harf = " + harf);

        sayi = 97;
        harf = (char) sayi;

        System.out.println("harf = " + harf);

        for (int i = 0; i <=255; i++) {
            harf = (char)i;
            System.out.println(i+ ".harf = " + harf);

        }
    }
}
