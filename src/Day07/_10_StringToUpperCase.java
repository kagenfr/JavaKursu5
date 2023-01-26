package Day07;

public class _10_StringToUpperCase {
    public static void main(String[] args) {
        //toUpperCase: stringi büyük harfe çevirir

        String text = "Merhaba Dünya";

        System.out.println("orjinal hali = " + text);

        System.out.println("text.toUpperCase() = " + text.toUpperCase());

        System.out.println("me veya ME ile başlıyor mu = " + text.toUpperCase().startsWith("ME"));

        System.out.println("text = " + text);
    }
}
