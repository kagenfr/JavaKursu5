package Day28._01_Constructor;

public class Okul {
    public static void main(String[] args) {

        //1. yol
        //nesne oluşma anı
        Student st1 = new Student();

        //özelliklerinin değeri veriliyor
        st1.id = 1;
        st1.ad = "Etka";
        st1.soyad = "Bilgen";
        st1.sinifi = 3;

        //2. yol
        Student st2 = new Student(1,"Etka","Bilgen",5);
        System.out.println("st2.ad = " + st2.ad);
        
        Student st3 = new Student(2,"Emir","Bilgen");
        System.out.println("st3.sinifi = " + st3.sinifi);

    }
}
