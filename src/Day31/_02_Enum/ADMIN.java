package Day31._02_Enum;
// Bir User yetkilendirme modülü yapılması isteniyor.
// USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
// USER STATUSU : AKTIF, PASIF
// Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
// Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
// kullanıcısı tanımlayınız.
// UserSilme isimli fonksiyona bu userları gönderiniz.
// ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim
public class ADMIN {
//    enum Role {ADMIN, MUDUR, SATIS, PERSONEL, TESTER}
//    enum Statu {AKTIF, PASIF}


    public static void main(String[] args) {

        USER user1 = new USER("etka", Role.ADMIN, Statu.AKTIF);
        USER user2 = new USER("ahmet", Role.MUDUR, Statu.PASIF);
        USER user3 = new USER("mehmet", Role.SATIS, Statu.AKTIF);

        userSil(user1);
        userSil(user2);
        userSil(user3);

        System.out.println("user1 = " + user1);
    }
    public static void userSil(USER user){
        if (user.role == Role.ADMIN)
            System.out.println(user.username + " Admin Silinemez");
    }
}
