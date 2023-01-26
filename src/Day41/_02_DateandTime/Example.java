package Day41._02_DateandTime;

import Utility.Myfunc;

import java.time.LocalTime;

import java.time.format.DateTimeFormatter;

public class Example {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("kk:mm:ss");
        while (true) {
            LocalTime saat = LocalTime.now();
            System.out.print("\r" + saat.format(f));
            Myfunc.Bekle(1);
        }
    }

}
