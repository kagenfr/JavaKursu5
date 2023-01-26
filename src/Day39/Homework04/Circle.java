package Day39.Homework04;


public class Circle extends Data {


    @Override
    public double getArea() {
        return pi*Math.pow(getRadius(),2);
    }
}
