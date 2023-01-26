package Day27._02_Example;

public class Example {
    // Math sınıfndaki metodlarıdan 5 tanesini
    // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
    // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
    // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
    // kullanımlarını yazınız.

    public static void main(String[] args) {
        int max = MyMath.getMax(4,6);
        int min = MyMath.getMin(4,6);
        int rnd = MyMath.getRandom(10);
        double pow = MyMath.getUsAl(4,6);
        double kk = MyMath.getKareKok(16);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("rnd = " + rnd);
        System.out.println("pow = " + pow);
        System.out.println("kk = " + kk);

    }
}
