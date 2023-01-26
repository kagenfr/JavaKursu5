package Day07;

public class Homework05 {
    public static void main(String[] args) {
        // **apple**  olan  bir String oluşturun.
        // String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
        // _Büyük harf veya küçük harf önemli değildir._
        
        String word1 = "apple";
        String word2 = "Apple";
        
        boolean esitMi = word1.equals(word2);

        System.out.println("esitMi = " + esitMi);


    }
}
