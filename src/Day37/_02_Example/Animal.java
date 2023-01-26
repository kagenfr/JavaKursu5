package Day37._02_Example;

public class Animal {
    private String color;
    private String age;
    private String race;

    public Animal(String color, String age, String race) {
        this.color = color;
        this.age = age;
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", age='" + age + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
