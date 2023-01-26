package Day18;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[] dizi = new int[10]; //boş default yani 0 olan
        int[] dizi2 ={2,3,4,5,6,7,56,67,77};

        int[][] tablo = new int[2][3]; //2 satır yani row, 3 sütun yani column
                                       //boş default değer 0 2x3 kadar 6 adet sayı
        int[][] tablo2 ={
                {2,3,4    }, //0.satır
                {34,45,5  } //1.satır
        };
        //1.yöntem
        for (int i = 0; i < 2; i++) {
            System.out.print(tablo2[i][0]+" ");
            System.out.print(tablo2[i][1]+" ");
            System.out.print(tablo2[i][2]+" ");

            System.out.println();

        }
        //2.yöntem
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(tablo2[satir][sutun]+" ");

            }
            System.out.println();
        }
    }
}
