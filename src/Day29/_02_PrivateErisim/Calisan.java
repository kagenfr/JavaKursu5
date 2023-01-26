package Day29._02_PrivateErisim;

public class Calisan {
    int id;
    String name;
    String surname;
    private String password;

    public void sifreAta(String sifre){
        if (sifre.length() < 8)
            System.out.println("Şifre zayıf");
        else
            password = sifre;
        System.out.println("Şifre başarıyla atandı");


    }
    public void sifreGoster(){
        System.out.println("****" + password.substring(4));


    }
}
