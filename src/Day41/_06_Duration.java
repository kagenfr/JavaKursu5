package Day41;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {
        //Duration: Hem LocalTime için hem de LocalDateTime için kullanılıyor.
        
        //LocalTime
        LocalTime dersBaslangic = LocalTime.of(19,0,0);
        LocalTime dersBitis = LocalTime.of(22,0,0);
        Duration gunlukDersSuresi = Duration.between(dersBaslangic,dersBitis);
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi);

        System.out.println("gunlukDersSuresi.toHours() = " + gunlukDersSuresi.toHours()); //farkın toplam saat hali
        System.out.println("gunlukDersSuresi.toMinutes() = " + gunlukDersSuresi.toMinutes()); //farkın toplam dk hali
        System.out.println("gunlukDersSuresi.toMillis() = " + gunlukDersSuresi.toMillis()); //farkın toplam ms hali
        
        /*
        1000       = mili saniye
        1000000    = mikro saniye
        1000000000 = nano saniye
         */
        //LocalDateTime *** 2 Tarih-Saat arasındaki fark;
        LocalDateTime from = LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to = LocalDateTime.now();
        
        Duration fark = Duration.between(from,to);
        System.out.println("fark = " + fark);
        System.out.println("fark.toDays() = " + fark.toDays());
        System.out.println("fark.toHours() = " + fark.toHours());
        System.out.println("fark.toMinutes() = " + fark.toMinutes());
        
        
    }
}
