package Day04;

public class _08_Example3 {
    public static void main(String[] args) {
        //String olarak verilen 2 adet bağış parasının toplamını yazdırınız.


        String bagis1="750";
        String bagis2="475";

        int intBagis1= Integer.parseInt(bagis1);
        int intBagis2= Integer.parseInt(bagis2);

        int toplamBagis= intBagis1+intBagis2;
        System.out.println("toplamBagis = " + toplamBagis);
    }
}
