package Day39._05_Example;

public class Palov implements IFood{
    @Override
    public void taste() {
        System.out.println("Enfes Palov Afiyet Olsun!");
    }

    @Override
    public double ucret() {
        return 44;
    }

    void fry() {
        System.out.println("Kızartıldı..");
    }

    void boil(){
        System.out.println("Haşlandı...");
    }
}
