package Day34.Paket2;

import Day34.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {
    public P2Kedi(){
        this.ad = ad;
        this.cinsi = cinsi; //defaulttan farklı olarak extend edildiğinde
        //diğer paketlerden de erişilebilir.
    }
}
