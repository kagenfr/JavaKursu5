package Day03;

public class _06_Example2 {
    public static void main(String[] args) {
        //ornek soru: yarıçapı(r) verilen bir dairenin çevresini ve alanını bulunuz.
        //alan= pi*r*r    cevre= 2*pi*r    pi=3.14    yaricap= r


        double r = 8;
        double alan = 3.14 * r * r;
        double cevre = 2 * 3.14 * r;

        System.out.println("cevre=" + cevre);
        System.out.println("alan=" + alan);


    }
}
