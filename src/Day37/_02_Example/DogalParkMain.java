package Day37._02_Example;

import java.util.ArrayList;

public class DogalParkMain {
    public static void main(String[] args) {
        Cat cats = new Cat("Grey", "3", "Scottish Fold");
        Duck ducks = new Duck("Black,Green", "2", "Anas");
        Shark sharks = new Shark("Baby blue,Grey", "45", "White");
        Swallow swallows = new Swallow("Red,Blue,Black", "1", "Red-Rumped");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cats);
        animals.add(ducks);
        animals.add(sharks);
        animals.add(swallows);

        for (Animal a:animals){
            System.out.println("--------------------------");
            System.out.println("Animal: " + a.getClass().getSimpleName() + " ");
            System.out.println("--------------------------");
            System.out.println("Color = " + a.getColor());
            System.out.println("Age = " + a.getAge());
            System.out.println("Race = " + a.getRace());

            if (a instanceof Cat){
                System.out.println(((Cat)a).food());

            }
            if (a instanceof Duck){
                System.out.println(((Duck)a).food());
                System.out.println(((Duck)a).flaying());
                System.out.println(((Duck)a).swimming());
            }
            if (a instanceof Shark){
                System.out.println(((Shark)a).food());
                System.out.println(((Shark)a).swimming());
            }
            if (a instanceof Swallow){
                System.out.println(((Swallow)a).food());
                System.out.println(((Swallow)a).flaying());
            }















        }

    }
}
