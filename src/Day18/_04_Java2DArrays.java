package Day18;

import java.util.Arrays;
import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.
        //todo: bu soruyu math.max şeklinde çözmeyi deneyin
        Scanner read = new Scanner(System.in);
        int[][] tablo = new int[2][3];

        //okuma işlemi
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Sayı giriniz = ");
                tablo[i][j] = read.nextInt();
            }
        }
        //yazma işlemi
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablo[i][j]+"\t");
            }
            System.out.println();
        }
        //en büyük bulma işlemi
        int enb = tablo[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablo[i][j]>enb)
                    enb = tablo[i][j];

            }

        }
        System.out.println("enb = " + enb);
    }
}
