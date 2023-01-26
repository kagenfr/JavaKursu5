package Day41;

import java.time.LocalDate;

public class _08_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate dun = bugun.minusDays(1);
        
        boolean sonraMi = bugun.isAfter(dun); //bugün dünden sonra mı?
        System.out.println("sonraMi = " + sonraMi); //true
        
        boolean onceMi = bugun.isBefore(dun); //bugün dünden önce mi?
        System.out.println("onceMi = " + onceMi); //false

        boolean esitMi = bugun.isEqual(dun); //bugün düne eşit mi?
        System.out.println("esitMi = " + esitMi); //false

        boolean artikYilMi = bugun.isLeapYear(); //bugünün tarihi artık(şubat ayı) yıl mı?
        System.out.println("artikYilMi = " + artikYilMi); //false
        
    }
}
