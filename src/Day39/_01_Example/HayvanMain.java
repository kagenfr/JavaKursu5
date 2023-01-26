package Day39._01_Example;

public class HayvanMain {
    public static void main(String[] args) {
        Kedi kedi = new Kedi("Cookie", false, "15/03/2022");
        System.out.println("\n***** " + kedi.getClass().getSimpleName() + " *****\n");
        System.out.println("kedi = " + kedi);

        Kartal kartal = new Kartal("Ken", true, "10/06/2020");
        System.out.println("\n***** " + kartal.getClass().getSimpleName() + " *****\n");
        System.out.println("kartal = " + kartal);

    }
}
