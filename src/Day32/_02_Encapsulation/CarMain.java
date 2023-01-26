package Day32._02_Encapsulation;
// Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
// Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
// Main de 1 tane nesne oluşturup bunu kontrol ediniz.
public class CarMain {
    public static void main(String[] args) {

        Car car1 = new Car("Black", 2022, 4.0, 3);
        System.out.println("car1 = " + car1);
        Car car2 = new Car("Blue", 2030, 1.6, 4);
        System.out.println("car2 = " + car2);

        // KURAL: genel yazılım kuralıdır.
        // bütün değişkenler private yapılır.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.
    }
}
