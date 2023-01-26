package Day33._02_Inheritance;

public class Ordek extends Hayvanlar{
   private double kanatAcikligi;

    public Ordek(String renk, int kilo, String cinsi, int kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);
    }

    public double getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(int kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }

    @Override
    public void konustu() {
        System.out.println("vakvakladı");
    }


}
