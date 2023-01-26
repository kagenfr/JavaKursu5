package Day32._03_Example;

public class Student {
    private int ID;
    private String name;
    private String surname;
    private int age;

    static int sayacID = 1;
    public Student(String name, String surname, int age) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setID(sayacID++);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 15)
        this.age = age;
        else
            System.out.println("Yaş sınırı 15'tir!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
