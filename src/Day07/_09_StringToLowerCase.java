package Day07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
        //toLowerCase: stringi küçük harfe çevirir

        String text= "Merhaba Dünya";

        System.out.println("orjinal hali text = " + text); //Merhaba Dünya

        System.out.println("text.toLowerCase() = " + text.toLowerCase()); //merhaba dünya

        System.out.println("me ile veya ME ile başlıyor mu= " + text.toLowerCase().startsWith("me"));

        System.out.println("text = " + text);
    }
}
