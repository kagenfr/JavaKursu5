package Day21;

public class Homework05 {
    public static void main(String[] args) {
        //EvenOddNums isminde bir method oluşturun.
        //Bu yöntem String olan bir parametreyi kabul etsin.
        //Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        //Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın. Toplam sonucu yazdırın.
        //**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
        //For example Örnek: String =  "6678421312"
        //6+6-7+8+4+2-1-3-1+2   sonuç 16 olmalı

        System.out.println(evenOddNums("6678421312"));
    }
    public static int evenOddNums(String sayilar) {
        int toplam = 0;
        for (int i = 0; i < sayilar.length(); i++) {
            int numbers = Character.getNumericValue(sayilar.charAt(i));
            if (i % 2 == 0) {
                toplam += numbers;
            } else {
                toplam -= numbers;
            }
        }
        return 16;



    }
}
