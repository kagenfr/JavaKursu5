package Day39._05_Example;

public class AdanaKebap implements IFood{
    @Override
    public void taste() {
        System.out.println("Enfes Adana Afiyet Olsun!");
    }

    @Override
    public double ucret() {
        return 55;
    }

    void marinade(){
        System.out.println("Marine edildi...");
    }

    void grill(){
        System.out.println("Kızartıldı...");
    }
}
