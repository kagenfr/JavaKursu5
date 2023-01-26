package Day37._01_Example;

import java.util.ArrayList;

public class FactoryMain {
    public static void main(String[] args) {
        TeslaCar tesla = new TeslaCar("S", 3.0);
        ToyotaPrius prius = new ToyotaPrius("Sedan", 1.4);
        Bus bus = new Bus("Iveco", 7.0);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(tesla);
        vehicles.add(prius);
        vehicles.add(bus);

        for (Vehicle v:vehicles){
            System.out.println("--------------------------");
            System.out.println("Vehicle: " + v.getClass().getSimpleName() + " "); //Classın adını verir
            System.out.println("--------------------------");
            System.out.println("Model = " + v.getModel());
            System.out.println("Motor = " + v.getEngine());

            if (v instanceof TeslaCar) {
                System.out.println(((TeslaCar) v).drive());
                System.out.println(((TeslaCar) v).changeBattery());
            }
            if (v instanceof ToyotaPrius) {
                System.out.println(((ToyotaPrius) v).drive());
                System.out.println(((ToyotaPrius) v).changeBattery());
                System.out.println(((ToyotaPrius)v).changeOil());
            }
            if (v instanceof Bus) {
                System.out.println(((Bus) v).drive());
                System.out.println(((Bus) v).changeDiesel());
            }
        }
    }
}
