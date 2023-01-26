package Day21;

public class Homework03 {
    public static void main(String[] args) {

        //reverseString isminde bir method oluşturun.
        //Bu method bir String'i parametre olarak alsın.
        //Ve bu method, girilen String'i tersten yazsın.
        //Terste yazılmış halini yazdırınız.
        //Örn: String = "Java'yı Seviyorum."
        //Print: .muroyiveS ıy'avaJ

        System.out.println(reverseString("I love Java"));
    }

    public static String reverseString(String tersten) {
        StringBuilder sb = new StringBuilder(tersten);
        return sb.reverse().toString();

    }
}
