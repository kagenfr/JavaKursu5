package Day31._01_Enum;

public class ExampleCozum {
    enum Aylar{
        Tanimsiz, OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN, TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
    }
    public static void main(String[] args) {
        Aylar ay = Aylar.MAYIS;

        switch (ay){
            case SUBAT: System.out.println(28); break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK: System.out.println(31); break;
            case NISAN:
            case HAZIRAN:
            case KASIM:
            case EYLUL: System.out.println(30); break;
        }
        if (ay == Aylar.MAYIS){
            System.out.println("zam yapıldı");
        }
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());

        for (Aylar a : Aylar.values()){
        }
    }
    // Yazılım dillerinde enum, enumaration ve enum sabitleri
    // olarak adladırılmaktadır. Tanımlanan değişkenlerin
    // sabit değer alması için kullanılır. Tanımlanan
    // bu sabit değerler bir grup oluşturur. Erişilmesi,
    // yönetilmesi ve anlaşılması kolay hale gelir.

    // bir sürü girilmesi gereken datayı  tek seferde
    // parti halinde giriyoruz,daha sonra kullanması
    // da kolay yazması da kolay oluyor









}
