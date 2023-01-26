package Day38._02_Abstract;

public class SekilMain {
    public static void main(String[] args) {
        Rectangle d = new Rectangle(4,5);
        d.setName("Yeni Dikdörtgen");
        d.ciz();
        System.out.println(d);

        Daire dr = new Daire(4);
        dr.setName("Yeni Daire");
        dr.ciz();
        System.out.println(dr);

    }
}
