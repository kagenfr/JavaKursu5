package Day07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        //replaceAll: replace gibi çalışır. farklı Kriter(regex) verilebiliyor.
        // regex : regular expression / düzenli ifadeler
        // TODO (yapılacak) : ödev : regex olarak neler yazılabiliyor google dan araştırılacak
        String text = "Merhaba Dünya123";

        System.out.println("text = " + text);

        System.out.println("abn -> _ = " + text.replaceAll("[abn]","_")); //Merh___ Dü_y_123
        //a veya b veya n leri _ yap -> Merh___ Dü_y_123

        System.out.println("A-Z -> _ = " + text.replaceAll("[A-Z]","_")); //_erhaba _ünya123

        System.out.println("0-9 -> '' = " + text.replaceAll("[0-9]","")); //rakamları sil

        System.out.println("0-9 dışındakiler -> '' = " + text.replaceAll("[^0-9]","")); //rakamlar dışındakileri sil
    }
}
