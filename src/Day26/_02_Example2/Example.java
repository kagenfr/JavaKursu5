package Day26._02_Example2;

public class Example {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        // çalıştığında kişinin doğum yılını versin.
        // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
        // şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

        Person cal1 = new Person();
        cal1.name = "Fatma";
        cal1.surName = "Demir";
        cal1.age = 30;

        Person cal2 = new Person();
        cal2.name = "Muhammed";
        cal2.surName = "Gürdal";
        cal2.age = 35;

        //1.yöntem
        System.out.println("cal1.name = " + cal1.name);
        System.out.println("cal1.surName = " + cal1.surName);
        System.out.println("cal1.age = " + cal1.age);

        System.out.println("cal2.name = " + cal2.name);
        System.out.println("cal2.surName = " + cal2.surName);
        System.out.println("cal2.age = " + cal2.age);

        //2.yöntem
        BilgiYazdir(cal1);
        BilgiYazdir(cal2);

        //3.yöntem
        cal1.BilgiYazdir();
        cal2.BilgiYazdir();

        //4.yöntem
        System.out.println("cal1 = " + cal1);
        System.out.println("cal2 = " + cal2);
        //5.yöntem
        cal1.getBirthYear(); //return işlemi olmadan
        cal2.getBirthYear();
        //6.yöntem
        System.out.println(cal1.getBirthYear2()); //return işlemiyle
        System.out.println(cal2.getBirthYear2());

        cal1.getInitials();
        cal2.getInitials();
    }

    public static void BilgiYazdir(Person cal) { //main içinde olursa "static" ile birlikte yazılması gerekiyor. Fakat main dışında "static" koymadan direkt "void" kullanarak yazılır.
        System.out.println("cal.name = " + cal.name);
        System.out.println("cal.surName = " + cal.surName);
        System.out.println("cal.age = " + cal.age);


    }


}
