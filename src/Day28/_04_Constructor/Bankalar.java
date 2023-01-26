package Day28._04_Constructor;

public class Bankalar {
    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.
    public static void main(String[] args) {
        banka banka1 = new banka();
        System.out.println("banka1 = " + banka1);
        banka banka2 = new banka("Ziraat",1798,2344);
        System.out.println("banka2 = " + banka2);
        banka banka3 = new banka("Garanti",1997);
        System.out.println("banka3 = " + banka3);


    }
}
