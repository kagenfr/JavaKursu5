package Day42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle = "";

        cumle = cumle + "Bugün";
        cumle = cumle + " hava";
        cumle += " çok soğuk";

        System.out.println("cumle = " + cumle);
        System.out.println("cumle.concat()" + cumle.concat(" fakat dün sıcaktı."));
        System.out.println("cumle = " + cumle);

        cumle = cumle.concat(" fakat dün sıcaktı");
        System.out.println("cumle = " + cumle);

        /**********************************/
        StringBuilder cumle2 = new StringBuilder();
        cumle2.append("Bugün ");
        cumle2.append("hava");
        cumle2.append(" çok soğuk");

        System.out.println("cumle2 = " + cumle2);

        /****** +, concat, StringBuilder - 3 model hızını test edeceğiz ******/

        long startTime = System.currentTimeMillis();
        String test1 = "";
        for (int i = 0; i < 10000; i++)
            test1 = test1 + " merhaba";

            System.out.println("+ için süre " + (System.currentTimeMillis()-startTime) + " ms");


        startTime = System.currentTimeMillis();
        String test2 = "";
        for (int i = 0; i < 10000; i++)
            test2 = test2.concat(" merhaba");

            System.out.println("concat için süre " + (System.currentTimeMillis()-startTime) + " ms");


        startTime = System.currentTimeMillis();
        StringBuilder test3 = new StringBuilder();
        for (int i = 0; i < 10000; i++)
           test3.append( " merhaba");

            System.out.println("StringBuilder için süre " + (System.currentTimeMillis()-startTime) + " ms");

        System.out.println("***********************\n\n");
        /******* StringBuilder ı tanıyalım *******/
        StringBuilder sb = new StringBuilder();
        sb.append("Bugün "); //kendine ekleme, atama gerektirmez. (concat te gerekirdi)
        sb.append("hava ");
        sb.append("güzel.");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());
        sb.append(4); //eklenen her şeyi toString hali var ise çevirerek ekler
        System.out.println("sb = " + sb);
        
        sb.reverse(); //stringi tersine çevirir.
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb); //tekrar düzelttik
        
        sb.delete(0,5); //(index) 0 dahil, 5 hariç siler.
        System.out.println("sb = " + sb);
        
        sb.deleteCharAt(3); //sadece belirtilen indexteki karakteri siler
        System.out.println("sb = " + sb);

        sb.insert(5, "kelime "); //belirtilen indexe yani araya ekler.
        System.out.println("sb = " + sb);

        sb = new StringBuilder("Bugün hava çok güzel"); //Sıfırlandı ve ilk değer atandı
        System.out.println("sb = " + sb);
        
        sb.replace(3,8,"bu"); //verilen aralığı "bu" stringle değiştirir.
        System.out.println("sb = " + sb);
        
        String strSb = sb.toString(); //toString çevirme

        /********* StringBuffer *********/
        StringBuffer sBuffer = new StringBuffer(); // tamamen StringBuilder ile aynı tek farkı
                                                   // paralel çalışan yazılımlarda, StringBuffer kullanılır.

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.


    }
}
