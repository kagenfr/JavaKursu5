package Day30;

public class GununSorusu {
    int a;
    static int b = 0;

    void arttir(){
        a++;
        b++;

    }

    public static void main(String[] args) {
        GununSorusu gs1 = new GununSorusu();
        gs1.a = 5;
        GununSorusu gs2 = new GununSorusu();
        gs2.a = 7;
        //a nın değeri kaç oldu? Burada verilecek cevap hangi a yı soruyorsunuz olmalı.
        //Burada her nesnenin a sı var ve gs1 in 5, gs2 nin 7 değeri var.

        System.out.println("gs1.a = " + gs1.a); //a 5
        System.out.println("gs2.a = " + gs2.a); //a 7

        //soru 2: b nin değeri kaçtır?

        System.out.println("b = " + GununSorusu.b);

        //soru 3: a nın ve b nin son değerleri kaçtır?
        gs1.arttir(); //gs1.a 5 ti 6 oldu ve b 0 dı 1 oldu
        gs2.arttir(); //gs2.a 7 ydi 8 oldu ve b 1 di 2 oldu

        //yukarıda 3. soruyla birlikte "void arttir" metodunu ekledik, böylelikle her nesne 1 kez artmış oldu
        System.out.println("gs1 = " + gs1.a);
        System.out.println("gs2 = " + gs2.a);
        System.out.println("b = " + GununSorusu.b);

        
    }}
