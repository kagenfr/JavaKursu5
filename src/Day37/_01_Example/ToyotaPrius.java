package Day37._01_Example;

public class ToyotaPrius extends Vehicle implements IElectric, IGas{
    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Bataryaların 4 yıllık ömrü vardır.";
    }

    @Override
    public String changeOil() {
        return "1 depo ile 300km gider.";
    }

    @Override
    public String drive() {
        return "İlk 3km'de elektrik kullanır.";
    }
}
