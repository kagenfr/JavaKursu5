package Day31._01_Enum;

public class Example {
    public static void main(String[] args) {
        //Verilen bir Ay NO ya göre, ayın gün sayısını veren programı yazınız.

        int ayNo = 5;

        switch (ayNo){
            case 2: System.out.println(28); break;
            case 1: //ocak
            case 3: //mart
            case 5: //mayıs
            case 22:
            case 10:
            case 12: System.out.println(31); break;
            case 6:
            case 9:
            case 11: System.out.println(30); break;
        }
        // okunabilirlik ve kontrollü yazılım yok, tanımlama yetersiz
        // numaradan gitmeye çalıştık, zorluklarla karşılaştık
        // bunun yerine isimden gitmeye çalışalım

        String ayAd = "Mayıs";
        switch (ayAd){
            case "şubat": System.out.println(28); break;
            case "Ocak":
            case "mart":
            case "agustos":
            case "haziran":
            case "aralık": System.out.println(31); break;
            case "temuz":
            case "eylul":
            case "Ekim":
            case "KASIM": System.out.println(30); break;
            //kontrol zor hataya açık, Boolean true 1, false 0.

            //Kullanıcı Tipi : Role: Student, Teacher, Admin, Mentor

            //if(kullanici == Role.Student){
            //}
            //else{
            //}

        }



    }
}
