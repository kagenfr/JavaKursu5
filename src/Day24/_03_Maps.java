package Day24;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _03_Maps {
    public static void main(String[] args) {
        //Bir kartvizit uygulamasını 2 kişi için yapınız

        HashMap<String,String> uKartVizit = new HashMap<>();
        uKartVizit.put("isim", "Uğur Yılmaz");
        uKartVizit.put("email", "ugur@gmail.com");
        uKartVizit.put("adres", "Çekmeköy/İstanbul");
        uKartVizit.put("telefon", "05056784321");

        System.out.println("uKartVizit.get(isim) = " + uKartVizit.get("isim"));
        System.out.println("uKartVizit.get(telefon) = " + uKartVizit.get("telefon"));

        HashMap<String,String> aKartVizit = new HashMap<>();
        aKartVizit.put("isim", "Ayşe Bayrak");
        aKartVizit.put("email", "ayse@gmail.com");
        aKartVizit.put("adres", "Şişli/İstanbul");
        aKartVizit.put("telefon", "05435467890");

        HashMap<String, HashMap<String,String>> kartvizitler = new HashMap<>();

        kartvizitler.put("ugur", uKartVizit);
        kartvizitler.put("ayse", aKartVizit);

        System.out.println("kartvizitler.get(ugur) = " + kartvizitler.get("ugur"));
        System.out.println("kartvizitler.get(ayse) = " + kartvizitler.get("ayse"));

        System.out.println("Ayşenin Adresi = " + kartvizitler.get("ayse").get("adres"));

        for (Map.Entry<String,HashMap<String,String>> kv:kartvizitler.entrySet()) {
            System.out.println("emailler = " + kv.getValue().get("email"));
            
        }



        }




     }

