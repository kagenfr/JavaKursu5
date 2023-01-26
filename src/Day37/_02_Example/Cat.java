package Day37._02_Example;

public class Cat extends Animal implements IAnimal{
    public Cat(String color, String age, String race) {
        super(color, age, race);
    }

    @Override
    public String food() {
        return "Günde 2 öğün, sabah ve akşam yemek yer.";
    }
}
