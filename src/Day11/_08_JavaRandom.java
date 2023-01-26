package Day11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        //Math.random() : double sayı üretir. 0-0,999999999999 arası sayı verir.

        double randSayi = Math.random();
        System.out.println("randSayi = " + randSayi);


        //0-6 arası üretsin
        //6 ile çarparım
        //0-5,99999999
        //int çevirirsem 0-5;

        int rndTamSayi = (int) (Math.random() * 6);


    }
}
