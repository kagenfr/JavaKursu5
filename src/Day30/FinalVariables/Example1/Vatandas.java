package Day30.FinalVariables.Example1;

public class Vatandas {
    String isim;
    final int tcNo;
    //Final değişkeni atandığında bir daha değiştirilemez. Sadece bir kez atama yapılabilir.
    //Atama işlemini ya tanımlarken ya da CONSTRUCTOR da yapabilirsin.
    //Bir kere atandıktan sonra değişim yapılmamasını istiyorsan FINAL değişkenini kullanmalısın
    //PRIVATE değişkeni sadece dışarıdan erişilemez yapar fakat değerler değiştirebilir.
    static int tcNoSayac = 1;
    //static sayac ise her yeni nesen oluşturulduğunda yeni artan değer almasını sağlıyor.

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = tcNoSayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
