package Day37._02_Example;

public class Duck extends Animal implements IFlaying, ISwimming{
    public Duck(String color, String age, String race) {
        super(color, age, race);
    }

    @Override
    public String food() {
        return "Genelde balık türleriyle beslenir.";
    }

    @Override
    public String flaying() {
        return "Genelde alçaktan uçarlar.";
    }

    @Override
    public String swimming() {
        return "Zaman zaman su üstünde bazen de su altında yüzerler.";
    }
}
