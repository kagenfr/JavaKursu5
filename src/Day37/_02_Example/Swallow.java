package Day37._02_Example;

public class Swallow extends Animal implements IFlaying{
    public Swallow(String color, String age, String race) {
        super(color, age, race);
    }

    @Override
    public String food() {
        return "Genelde böcek ve türevleriyle beslenir.";
    }

    @Override
    public String flaying() {
        return "Genelde süzülerek uçarlar.";
    }
}
