package Day37._01_Example;

public class TeslaCar extends Vehicle implements IElectric{
    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Bataryaların 9 yıl ömrü vardır.";
    }

    @Override
    public String drive() {
        return "Autopilot özelliği vardır.";
    }

}
