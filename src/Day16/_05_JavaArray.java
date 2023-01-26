package Day16;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Collection;

public class _05_JavaArray {
    public static void main(String[] args) {
        String[] kanallar = {"trt", "kanald", "atv", "fox", "habertürk"};

        //2. yöntem
            double rndKanal = (Math.random()* kanallar.length);
            rndKanal *= 5;

            int rndIndex = (int) rndKanal;
            System.out.println(kanallar[rndIndex]);


            // TODO : gunun sorusu : bir döngü ile 5 tane buldurunuz
            // fakat bir kere bulduğunu tekrar bulmasın.


        }


    }
