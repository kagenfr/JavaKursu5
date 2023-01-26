package Day08;

public class _05_JavaAssignmentOperators {
    public static void main(String[] args) {
        int a=10;

        // a=a+5; //a? 15 olur
        //veya
        a+=5; //yine aynı 15 olur
        //a nın artış miktarı 5 dir.

        System.out.println("a = " + a);
        int b=10;

        //b=b-5;  //b? 5 oldu
        //veya
        b-=5;  // aynısı 5 olur
        //b nin azalış miktarı 5 dir

        System.out.println("b = " + b);

        int c=10;
        //c=c/5;  //c 2 olur
        c/=5;
        //c nin bölüm değeri 5 dir

        System.out.println("c = " + c);
        
        int d=10;
        //d=d*5;  //d nin çarpım değeri 50 dir
        d*=5;

        System.out.println("d = " + d);

        
    }
}
