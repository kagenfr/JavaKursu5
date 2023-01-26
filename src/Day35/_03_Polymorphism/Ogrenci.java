package Day35._03_Polymorphism;

public class Ogrenci extends Kisi {
    private int subesi;
    public Ogrenci(String ad, String soyad, String gorevi, int subesi) {
        super(ad, soyad, gorevi);
        setSubesi(subesi);
    }

    public int getSubesi() {
        return subesi;
    }

    public void setSubesi(int subesi) {
        this.subesi = subesi;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "subesi=" + subesi +
                "} " + super.toString();
    }
}
