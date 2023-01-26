package Day39._05_Example;

public class Lahmacun implements IFood{
    @Override
    public void taste() {
        System.out.println("Enfes Lahmacun Afiyet Olsun!");
    }

    @Override
    public double ucret() {
        return 33;
    }

    void dough(){
        System.out.println("Hamur açldı...");
    }

    void addMeat(){
        System.out.println("Kıyması eklendi..");
    }

    void bake(){
        System.out.println("Pişirildi...");
    }
}
