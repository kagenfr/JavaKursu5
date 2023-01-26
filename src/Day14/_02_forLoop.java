package Day14;

public class _02_forLoop {
    public static void main(String[] args) {
        //1 den 5 e kadar olan sayıları ekrana yazdırınız.

        //while döngüsünü, döngünün kaç kere döneceği belli olmayan durumlarda kullanacağız
        int i = 0;
        while (i <= 5){

            System.out.println("i = " + i);
            i++;
        }

        //for döngüsünü, başı belli sonu belli artışı belli ise kullanacağız
        for (i = 0; i <=5; i++)
        System.out.println("i = " + i);

    }
}

        //1- Başı belli, sonu belli,
        //yani kaç adım döneceği belli ve artış miktarı
        //belli ise bu FOR döngüsüdür.

        //2- Kaç kere döneceği belli değil ise
        //(kullanıcı 0 değeri girene kadar)
        //WHILE döngüsüdür.

        //3-While döngüsünde döngü kontrolü işlemden sonra
        //ise DO-WHILE dongusudur.
