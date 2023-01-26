package Day26._04_Example;
public class ElektrikHesabi {
   int toplamTuketim = 0;
   double birimFiyat = 0.7;
   double fatura = 0;


    public void tuketimEkle(int aylikTuketim) {
        toplamTuketim+=aylikTuketim;
    }
    public void toplamTuketimYaz(){
        System.out.println("toplamTuketim = " + toplamTuketim);

    }
    public void faturaYaz(String isim){
        double toplamTutar=toplamTuketim*birimFiyat;
        System.out.println("*********************");
        System.out.println("      Faturanız      ");
        System.out.println("*********************");
        System.out.println("Müşteri = " + isim);
        System.out.println("toplamTuketim = " + toplamTuketim);
        System.out.println("toplamTutar = " + Math.round(toplamTutar));
        System.out.println("*********************");
    }
}


