package Day34.Paket2;

import Day34.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan p2h = new P1Hayvan();
        p2h.ad = "köpek";
        //p2h.yas default diğer paketten erişilemez
        //p2h.cinsi protected diğer paketten direkt erişemedim
    }
}
