package Day07;

public class Homework03 {
    public static void main(String[] args) {
        //**apple** olan bir String oluşturun.
        //String'in _içinde_ **app** olup olmadığını **doğrula**

        String word = "apple";

        boolean varMi = word.contains("app");

        System.out.println("varMi = " + word.contains("app"));
    }
}
