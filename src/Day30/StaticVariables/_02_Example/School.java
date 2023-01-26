package Day30.StaticVariables._02_Example;

public class School {
    public static void main(String[] args) {
        //Student (id, name, surname)
        //Yukarıdaki gibi 5 öğrenci tanımlayınız

        Student st1 = new Student(1, "Etka Bilgen");
        Student st2 = new Student(2, "Emir Bilgen");
        Student st3 = new Student(3, "Enes Bilgen");
        //Problem hem id yi takip etmek zorundayım,
        //hem de hata olasılığı yüksek

        Student st10 = new Student(1, "Etka Bilgen");
        Student st11 = new Student(2, "Emir Bilgen");
        Student st12 = new Student(3, "Enes Bilgen");
        System.out.println("st10 = " + st10);
        System.out.println("st11 = " + st11);
        System.out.println("st12 = " + st12);
    }
}
