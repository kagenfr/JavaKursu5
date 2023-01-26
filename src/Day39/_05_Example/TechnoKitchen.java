package Day39._05_Example;

public class TechnoKitchen {

    public static void hazirla(IFood food) {
        if (food instanceof AdanaKebap) {
            ((AdanaKebap) food).marinade();
            ((AdanaKebap) food).grill();
            ((AdanaKebap) food).taste();
            System.out.println("===============");
        } else if (food instanceof Lahmacun) {
            ((Lahmacun) food).dough();
            ((Lahmacun) food).addMeat();
            ((Lahmacun) food).bake();
            ((Lahmacun) food).taste();
            System.out.println("===============");
        } else if (food instanceof Borsh) {
            ((Borsh) food).boil();
            ((Borsh) food).eatTomorrow();
            ((Borsh) food).taste();
            System.out.println("===============");
        } else if (food instanceof Palov) {
            ((Palov) food).fry();
            ((Palov) food).boil();
            ((Palov) food).taste();
        }
    }
}
