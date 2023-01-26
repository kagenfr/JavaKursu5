package Day17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // Bu gun hava cok guzel -> 5 (for döngüsü ile)


        Scanner read = new Scanner(System.in);
        System.out.print("Cümle giriniz = ");
        String cumle = read.nextLine();

        int boslukSayisi = 0;
        for (int i = 0; i < cumle.length(); i++) {
            
            if (cumle.charAt(i)==' ')
                boslukSayisi++;
            
            
        }

        System.out.println("Kelime sayısı = " + (boslukSayisi+1));

        






    }
}
