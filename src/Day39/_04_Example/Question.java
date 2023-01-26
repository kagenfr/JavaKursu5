package Day39._04_Example;

class C{
    public C() { //dede

    }
}
class B extends C{ //baba
    public B() {
        System.out.println("B");
    }
}
class A extends B{ //çoçuk
    public A() {
        System.out.println("A");
    }
}
public class Question {
    public static void main(String[] args) {
        A a = new A();

    }

}
