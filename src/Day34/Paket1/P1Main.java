package Day34.Paket1;

public class P1Main {
    public static void main(String[] args) {
        P1Hayvan p1h = new P1Hayvan();
        p1h.ad = "karakedi"; //public erişildi
        p1h.yas = 3; //default erişildi
        p1h.cinsi = "tekir"; //protected erişildi
        //p1h.renk //private sadece kendi class ından

    }
}
