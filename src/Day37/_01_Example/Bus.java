package Day37._01_Example;

public class Bus extends Vehicle implements IDiesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "1 depo ile 1000km kadar gider.";
    }

    @Override
    public String drive() {
        return "En fazla 90km hız yapabilir.";
    }
}
