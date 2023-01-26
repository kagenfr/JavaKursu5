package Day41;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonedDateTime {
    public static void main(String[] args) {
        //Başka zaman bölgelerinin (Time Zone) zaman bilgisini alma;

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("zdt = " + zdt);

        Set<String> zamanBolgeleri = ZoneId.getAvailableZoneIds();
        
        for (String z:zamanBolgeleri){
            if (z.toLowerCase().contains("ist"))
            System.out.println("z = " + z);
        }
        ZoneId zoneIdIstanbul = ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul = ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);
        
        ZoneId zoneIdParis = ZoneId.of("Europe/Paris");
        ZonedDateTime zoneParis = ZonedDateTime.now(zoneIdParis);
        System.out.println("zoneParis = " + zoneParis);

        ZoneId zoneIdLondon = ZoneId.of("Europe/London");
        ZonedDateTime zoneLondon = ZonedDateTime.now(zoneIdLondon);
        System.out.println("zoneLondon = " + zoneLondon);

        ZoneId zoneIdAlmaty = ZoneId.of("Asia/Almaty");
        ZonedDateTime zoneAlmaty = ZonedDateTime.now(zoneIdAlmaty);
        System.out.println("zoneAlmaty = " + zoneAlmaty);
    }
}
