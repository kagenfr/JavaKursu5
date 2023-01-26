package Day21;

public class Homework07 {
    public static void main(String[] args) {
        //powerOfThree isminde bir method oluşturun.
        //Parametre olarak int. Return tipi boolean
        //Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        //**Örnek 1:**
        //**Girdi:** 27
        //**Çıktı:** true
        //Açıklama: 3*3*3 =27
        //Sonuç= true

        System.out.println("3*3*3 = 27");
        System.out.println(powerOfThree(27));

    }
    public static boolean powerOfThree(int number) {
        if (number == 1) {
            return true;
        }
        while (number % 3 == 0) {
            number /= 3;
        }
        return number == 1;


    }
}
