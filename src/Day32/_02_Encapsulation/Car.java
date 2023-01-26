package Day32._02_Encapsulation;

public class Car {
    private String color;
    private int model;
    private double engine;
    private int doorAmount;

    public Car() {
    }

    public Car(String color, int model, double engine, int doorAmount) {
        setColor(color);
        setModel(model);
        setEngine(engine);
        setDoorAmount(doorAmount);
//        this.color = color;
//        this.model = model;
//        this.engine = engine;
//        this.doorAmount = doorAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if (model < 2023)
            this.model = model;
        else
            System.out.println("hatalı model");
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        if (engine < 6.0)
        this.engine = engine;
        else
            System.out.println("hatalı motor hacmi");
    }

    public int getDoorAmount() {
        return doorAmount;
    }

    public void setDoorAmount(int doorAmount) {
        if (doorAmount < 7)
        this.doorAmount = doorAmount;
    else
            System.out.println("hatalı kapı sayısı");
    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model=" + model +
                ", engine=" + engine +
                ", doorAmount=" + doorAmount +
                '}';
    }
}
