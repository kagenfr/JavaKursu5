package Day33._03_Inheritance;

public class Worker {
    private String name;
    private double maas;
    private double maasKatSayisi;

    public double maasHesapla(){
        return maas*maasKatSayisi;
    }

    public Worker(String name, double maas, double maasKatSayisi) {
        setName(name);
        setMaas(maas);
        setMaasKatSayisi(maasKatSayisi);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public double getMaasKatSayisi() {
        return maasKatSayisi;
    }

    public void setMaasKatSayisi(double maasKatSayisi) {
        this.maasKatSayisi = maasKatSayisi;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "İsim= '" + name + '\'' +
                ", Maaş= " + maas +
                ", Maaş katsayısı= " + maasKatSayisi +
                ", Ödenecek maaş= " + maasHesapla() +
                '}';
    }
}
