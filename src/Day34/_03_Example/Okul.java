package Day34._03_Example;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo1 = new LiseOgrencisi("Etka Bilgen", OgrTip.LISE, "TM");
        LiseOgrencisi lo2 = new LiseOgrencisi("Erva Bilgen", OgrTip.LISE, "MF");
        IlkOkulOgrencisi ioo1 = new IlkOkulOgrencisi("Emir Bilgen", OgrTip.ILK, "Satranc");
        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("ioo1 = " + ioo1);
    }
}
