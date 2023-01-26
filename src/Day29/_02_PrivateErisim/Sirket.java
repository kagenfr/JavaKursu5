package Day29._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1 = new Calisan();
        cal1.id = 1;
        cal1.name = "etka";
        cal1.surname = "bilgen";
        //cal1.password = "1234";
        //private kendi paketinden bile çağırılamaz.

        cal1.sifreAta("1234");
        cal1.sifreAta("wqr_rq231");
        cal1.sifreGoster();
    }
}
