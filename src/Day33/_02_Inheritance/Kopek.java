package Day33._02_Inheritance;

public class Kopek extends Hayvanlar{
    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        System.out.println("havladı");
    }
}
