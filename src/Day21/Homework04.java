package Day21;

public class Homework04 {
    public static void main(String[] args) {
            //Adı  reverseWord olan bir method oluşturun
            //Bu methodun String olarak bir parametresi olmalıdır
            //Ve bu cümledeki kelimelerle tersine çevirmeli
            //Ters halini yazdırın. Örnek 1 : Dize: Java yazın
            //dönüş şöyle olmalıdır: yazın Java

        System.out.println(reverseWord("Write Java"));
    }

    public static String reverseWord(String tersKelime) {
        String[] words = tersKelime.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();

    }
}
