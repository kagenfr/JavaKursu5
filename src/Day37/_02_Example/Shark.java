package Day37._02_Example;

public class Shark extends Animal implements ISwimming{
    public Shark(String color, String age, String race) {
        super(color, age, race);
    }

    @Override
    public String food() {
        return "Genelde her türlü balıkla beslenir.";
    }

    @Override
    public String swimming() {
        return "Daha çok derinlerde yüzer.";
    }
}
