package Day04;

public class _06_Example2 {
    public static void main(String[] args) {
        //Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        //ve bir satırda boyunuz..ve kilonuz.. şeklinde yazınız.
        //vücut kitle indexini de bularak yazdırınız. kg / (boy*boy)

        double kilo = 80.43;
        int boy = 178;
        double kitleIndex = kilo / (boy * boy);
        System.out.println("kilo = " + kilo + " " + "boy = " + boy);
        System.out.println("kitleIndex = " + kitleIndex);
    }
}
