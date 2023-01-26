package Day33._02_Inheritance;

public class Kedi extends Hayvanlar{
    public Kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        System.out.println("miyavladı");
    }
}
