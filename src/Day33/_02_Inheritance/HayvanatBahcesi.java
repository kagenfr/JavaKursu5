package Day33._02_Inheritance;
//    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    köpekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ördek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konuştu metodu vardır.
public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kopek kopek1 = new Kopek("Beyaz", 50, "Kangal");
        kopek1.konustu();
        System.out.println("kopek1 = " + kopek1);
        Kedi kedi1 = new Kedi("Siyah", 30, "British Shorthair");
        kedi1.konustu();
        System.out.println("kedi1 = " + kedi1);
        Ordek ordek1 = new Ordek("Yeşil", 23, "Pekin", 45);
        ordek1.konustu();
        System.out.println("ordek1 = " + ordek1);
        Yilan yilan1 = new Yilan("Sarı", 20, "Piton", 50);
        yilan1.konustu();
        System.out.println("yılan1 = " + yilan1);



    }

}
