package Day20;

public class _01_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");

        merhabaYaz(); //giden yok, dönen yok
        toplamYaz(4,5); //giden var dönen yok (fonksiyonu bir şeye eşitleyebiliyor muyum)
        int enb=Math.max(4,5); //giden var, dönen var (fonksiyonu bir şeye eşitleyebiliyor muyum)
        double sayi = Math.random(); //giden yok, dönen var

        enbYaz(4,5);
        enb=enbBul(4,5);
        System.out.println("enb = " + enb);
        //fonksiyonda return olduğu için mainde yazdırabiliyoruz
        //yani fonksiyonun sonucunu alabiliyoruz
    }
    public static int enbBul(int a, int b){ //dönecek tip
        int donecek = 0;
        if (a>b)
            donecek=a;
        else
            donecek=b;
        return donecek; //dönecek değer
    }
    public static void enbYaz(int a, int b){
        if (a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }
    public static void toplamYaz(int a, int b){
        System.out.println(a+b);
    }
    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya");
    }
}
