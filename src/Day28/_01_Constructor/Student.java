package Day28._01_Constructor;

public class Student {
    int id;
    String ad;
    String soyad;
    int sinifi;

    Student(){ //yapıcı metodlar: Constructor Metodlar
        System.out.println("nesne oluşturuldu");

    }
    Student(int id, String ad, String soyad, int sinifi){ //yapıcı metodlar: Constructor Metodlar
      this.id=id; //burada "this" buradakini kullan anlamına geliyor.ı
      this.ad=ad;
      this.soyad=soyad;
      this.sinifi=sinifi;

    }
    Student(int id, String ad, String soyad){
        this(id,ad,soyad,0); //"this" burada öğrenci metodunun kendisi

        //        this.id=id;
        //        this.ad=ad;
        //        this.soyad=soyad;
        //        this.sinifi=0;
}
}
