package Day27._01_Example;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {
        int sayi = 345;
        String strSayi = String.valueOf(sayi);
        int intSayi = Integer.parseInt(strSayi);

        Utility uti = new Utility();
        String strSayi2 = uti.getString(sayi);

        String strSayi3 = Utility.getString2(sayi);








    }
}
