package Day35._02_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1 = new Kopek("karabaş");
        kopek1.ses();
        kopek1.kokladi();

        Kedi kedi1 = new Kedi("cookie");
        kedi1.ses();
        kedi1.tirmaladi();

        kopekSesi(kopek1);
        kediSesi(kedi1);

        hayvanSesi(kopek1);
        hayvanSesi(kedi1);

        /*********************************************/
        //Referans tipi       //Nesne tipi
        Hayvan hayvan1 = new Hayvan("ördek"); //hayvanlardan 1 hayvan
        Hayvan hayvan2 = new Kopek("kangal"); //hayvanlardan 1 köpek
        Hayvan hayvan3 = new Kedi("boncuk"); //hayvanlardan 1 kedi

        System.out.println("-----------------------");
        hayvan1.ses(); //genel hayvan, ses çıkardı
        hayvan2.ses(); //köpek, havladı
        hayvan3.ses(); //kedi, miyavladı
        System.out.println("-----------------------");

        hayvan2.ses(); //köpek de olsa hayvan referansı sebebiyle metodlar kısıtlı

        ((Kopek)hayvan2).kokladi(); //Tip dönüşümü kullanarak burada kokladı metodunu aktif edebiliyoruz.
        // ((int)Math.random()) casting burdaki gibi, tip dönüşümü

        // Setlerden HashSet
        // Maplerden HashMAp
        // Listlerden ArrayList

        //Polymorphism -
        //çok formluluk  - Çok çeşitlilik
        //şizofren bir konu

        //Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
        //ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.
    }
    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }
    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }
    public static void hayvanSesi(Hayvan hayvan){
        hayvan.ses();

        if (hayvan instanceof Kopek)
            ((Kopek)hayvan).kokladi();
        if (hayvan instanceof Kedi)
            ((Kedi)hayvan).tirmaladi();
    }
}

