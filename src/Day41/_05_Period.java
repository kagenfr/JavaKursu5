package Day41;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;


public class _05_Period {
    public static void main(String[] args) {
        //Period 2 tarih arasındaki farkı gösterir.
        //LocalDate ler için kullanılır.

        LocalDate dogumTarihi = LocalDate.of(1996, 6,12);
        LocalDate bugun = LocalDate.now();

        Period fark = Period.between(dogumTarihi, bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears() + "Yaşındasınız");

        /***********************************************/

        Period period3gun = Period.ofDays(3);
        System.out.println("period3gun = " + period3gun);
        Period period3ay = Period.ofMonths(3);
        System.out.println("period3ay = " + period3ay);
        
        LocalDate ucGunSonra = bugun.plus(period3gun);
        System.out.println("ucGunSonra = " + ucGunSonra);
        LocalDate ucAySonra = bugun.plus(period3ay);
        System.out.println("ucAySonra = " + ucAySonra);

        /**********************************************/
        
        //Kursun bitiş tarihini bulmak;
        
        LocalDate kursBaslangic = LocalDate.of(2022,10,31);
        Period kursSure = Period.ofMonths(6);
        LocalDate kursBitis = kursBaslangic.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());
        
        Period neKadarSureKaldi = Period.between(bugun, kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);
        
        Period neZamandirDevamEdiyor = Period.between(kursBaslangic,bugun);
        System.out.println("neZamandirDevamEdiyor = " + neZamandirDevamEdiyor);
        
        
        

    }
}
