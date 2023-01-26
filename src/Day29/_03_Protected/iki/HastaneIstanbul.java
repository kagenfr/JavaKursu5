package Day29._03_Protected.iki;

import Day29._03_Protected.bir.Doctor;

public class HastaneIstanbul {
    public static void main(String[] args) {
        Doctor dok1 = new Doctor("mehmet");
        dok1.hastaneAd = "İstanbul Hastane";

        //Doctor dok2 = new Doctor();
        //default sadece kendi paketinden ulaşılabilir.

    }
}
