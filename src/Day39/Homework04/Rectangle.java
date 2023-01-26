package Day39.Homework04;

public class Rectangle extends Data{

    @Override
    public double getArea() {
        return getLength()*getWidth();
    }
}
