package Day25;
// metodların yazıldığı yer
public class _01_JavaClassAndObject {
    public static void main(String[] args) { // başla
        // ana programın başladığı ve çalıştığı yer
        int sayi = 5;
        
        Araba benimArabam = new Araba(); //Araba tür, tip adı, benimArabam nesne
        benimArabam.marka = "BMW";
        benimArabam.renk = "beyaz";
        benimArabam.yili = 2000;
        benimArabam.motorHacmi = 1600;

        System.out.println("Marka = " + benimArabam.marka);
        System.out.println("Renk = " + benimArabam.renk);
        System.out.println("Yılı = " + benimArabam.yili);
        System.out.println("Motor Hacmi = " + benimArabam.motorHacmi);
    } // dur
    
}
//class-tiplerin tanımlandığı yer
class Araba {
    String renk;
    int yili;       
    String marka;
    int motorHacmi;
    
    
    
}