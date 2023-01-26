package Day38._03_Abstract;

public class YemekDunyasi {
    public static void main(String[] args) {
        Baklava baklava = new Baklava();
        baklava.setName("***** Baklava *****" + "\n");
        baklava.madeIn();
        baklava.taste();
        CheeseCake cheeseCake = new CheeseCake();
        cheeseCake.setName("***** Cheesecake *****" + "\n");
        cheeseCake.madeIn();
        cheeseCake.taste();
        GreekSalad greekSalad = new GreekSalad();
        greekSalad.setName("***** Greek Salad *****" + "\n");
        greekSalad.madeIn();
        greekSalad.taste();
        SezarSalad sezarSalad = new SezarSalad();
        sezarSalad.setName("***** Sezar Salad *****" + "\n");
        sezarSalad.madeIn();
        sezarSalad.taste();
    }
}
