package Day07;

public class _04_StringLastIndexOf {
    public static void main(String[] args) {
        //indexOf gibi çalışır bu aramaya baştan başlar
        //lastIndexOf ise aramaya sondan başlar

        String s1 = "Merhaba";

        System.out.println("s1.indexOf(a) = " + s1.indexOf("a")); //4

        System.out.println("s1.indexOf(a) = " + s1.lastIndexOf("a")); //6


    }
}
