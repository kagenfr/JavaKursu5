package Day33._03_Inheritance;

public class CEO extends Worker{
    private double tazminat;
    public CEO(String name, double maas, double maasKatSayisi, double tazminat) {
        super(name, maas, maasKatSayisi);
        setTazminat(tazminat);


    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+getTazminat();
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return "CEO{" +
                "İsim= '" + getName() + '\'' +
                ", Maaş= " + getMaas() +
                ", Maaş katsayısı= " + getMaasKatSayisi() +
                ", Tazminat= " + tazminat +
                ", Ödenecek maaş= " + maasHesapla() +
                '}';
    }
}
