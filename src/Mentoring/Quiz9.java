package Mentoring;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Quiz9 {
    public static void main(String[] args) {
        // Ornek 2: Verilen bir Character Array ini String e ceviren programi yaziniz...
        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};

        for (int i = 0; i < ch.length ; i++) {
            Arrays.toString(ch);
            System.out.print(ch[i]);

        }
        System.out.println();
        //1.yöntem
        String str = "";
        for (int i = 0; i < ch.length ; i++) {
            str+=ch[i];
        }
        System.out.println("str = " + str);
        //2.yöntem
        String str2 = new String(ch);
        System.out.println("str2 = " + str2);
        
        //3.yöntem
        String str3 = String.valueOf(ch);
        System.out.println("str3 = " + str3);
    }
    
    
    
    
}
