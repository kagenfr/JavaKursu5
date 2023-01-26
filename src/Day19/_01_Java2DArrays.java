package Day19;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo = {
                {3, 4, 55},
                {234, 22, 33}
        };

        System.out.println("Satır uzunluğu = " + tablo.length);
        System.out.println("0. Satırın uzunluğu = " + tablo[0].length);
        System.out.println("1. Satırın uzunluğu = " + tablo[1].length);

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j] + "\t");

            }
            System.out.println();

        }
    }

}
