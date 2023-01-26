package Day35._01_Final.ClassFinal;

public class ArabaMain {
    public static void main(String[] args) {
        Tasit t1 = new Tasit();
        t1.model = "opel";

        Tasit t2 = new Tasit();
        t2.model = "opel";
        //kullanım kısmında bir sınırlama yok

        //yani class final olursa eger mainde
        //birden fazla cagirilabiliyor fakat
        //baska class a extend edilemez
    }
}
