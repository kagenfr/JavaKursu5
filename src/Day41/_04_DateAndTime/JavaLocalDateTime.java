package Day41._04_DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalDateTime {
    public static void main(String[] args) {
        //Local Date Time; hem tarih hem de saat bilgisini tutar.

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Local Date & Time = " + dt);
        System.out.println("Year = " + dt.getYear());
        System.out.println("Month = " + dt.getMonth());
        System.out.println("Day Of Year = " + dt.getDayOfYear());
        System.out.println("Month Value = " + dt.getMonthValue());
        System.out.println("Day Of Month = " + dt.getDayOfMonth());
        System.out.println("Day Of Week = " + dt.getDayOfWeek());
        System.out.println("Day Of Week + Value = " + dt.getDayOfWeek().getValue());
        System.out.println("Hour = " + dt.getHour());
        System.out.println("Minute = " + dt.getMinute());
        System.out.println("Second = " + dt.getSecond());
        System.out.println("Nano = " + dt.getNano());

        System.out.println("ISO DATE TIME = " + dt.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("SHORT = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        //özel formatta istediğimiz gibi yazdırma
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("Özel Format = " + dt.format(f));
    }
}
