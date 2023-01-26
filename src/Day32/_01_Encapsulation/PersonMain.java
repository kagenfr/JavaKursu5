package Day32._01_Encapsulation;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        //person1.ad = "etka";
        //person1.soyad = "bilgen";
        //person1.yas = -25;
        person1.setAd("etka");
        person1.setSoyad("bilgen");
        person1.yasAta(-25);

        System.out.println(person1.yasVer());

        System.out.println("person1 = " + person1);
        //değişkene direkt erişimi kapatıp bir metod ile korumalı
        //veri gönderme ve alma işlemine Encapsulation denir.
    }

}
