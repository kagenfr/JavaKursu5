package Day03;

public class _05_Example1 {
    public static void main(String[] args) {
        // iki kenarı tanımlı olarak verilen bir
        // dikdörtgenin çevresini ve alanını bulunuz.
        // çarpma: * ,  x ise harf olarak kullanılıyor
        // bir kenarı a ise, diğer kenarı b ise, cevre=a+a+b+b, alan= a*b


        int aKenar= 9;
        int bKenar= 8;

        int cevre= aKenar+aKenar+bKenar+bKenar;
        int alan= aKenar*bKenar;

        System.out.println("cevre="+cevre);
        System.out.println("alan="+alan);

    }
}
