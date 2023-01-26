package Day33._03_Inheritance;

public class CompanyMain {
    public static void main(String[] args) {
        Worker worker1 = new Worker("etka", 2000, 1.15);
        CEO ceo = new CEO("erva", 5000, 1.25, 1000);
        System.out.println("worker1 = " + worker1);
        System.out.println("ceo = " + ceo);
        

    }
}
