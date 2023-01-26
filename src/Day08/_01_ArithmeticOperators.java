package Day08;

public class _01_ArithmeticOperators {
    public static void main(String[] args) {

        int a=9;
        int b=5;

        System.out.println("Toplama işlemi");
        System.out.println("a+b = " + (a+b));

        System.out.println("Çıkartma işlemi");
        System.out.println("a-b = " + (a-b));

        System.out.println("Çarpma işlemi");
        System.out.println("a*b = " + (a*b));

        System.out.println("Bölme işlemi");
        System.out.println("a*b = " + (a*b));

        System.out.println("Bölme işlemi");
        System.out.println("a/b = " + (a/b));
        //normal sonuç 1.8, fakat tam sayının tam sayıya bölümünde küsürat atılır
        //bu sebeple sonuç 1 olur, yuvarlama yapmaz. çünkü int/int
        //tam sonuç istersen bir tanesini double çevirmen yeterli
        System.out.println("double a/b = " + ((double)a/b));

        System.out.println("Modül İşlemi");
        System.out.println("a%b = " + (a%b));
        System.out.println("b%a = " + (b%a));
        //    Kısa önemli not!
        //    Modül (%)'de
        //    Sol büyük ise kalanı al
        //    Sol küçük ise solundakini al
        
    }
}
