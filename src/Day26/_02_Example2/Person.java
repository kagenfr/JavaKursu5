package Day26._02_Example2;

public class Person {
    String name;
    String surName;
    int age;

   //Bu kısım çok önemli!!!
    public void BilgiYazdir(){
        System.out.println("cal.name = " + name);
        System.out.println("cal.surName = " + surName);
        System.out.println("cal.age = " + age);


    }
    //Bu kısım çok öenmli!!!
    public String toString() {
        return name+" "+surName+" "+age;
    }
    public void getBirthYear() {

        System.out.println("doğum yılı = " + (2022-age));

    }
    public String getBirthYear2() {

        return "doğum yılı = " + (2022-age);

    }
    public void getInitials(){

        System.out.println(name.toUpperCase().charAt(0) + "." + surName.toUpperCase().charAt(0)+".");



    }

}
