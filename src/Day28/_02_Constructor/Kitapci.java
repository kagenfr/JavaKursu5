package Day28._02_Constructor;

public class Kitapci {
    // Book class yazınız.fields: name,publishYear,author.
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Olasılıksız";
        book1.publishYear = 2008;
        book1.author = "Adam Fawer";
        System.out.println("\n*** First Book ***\n");
        System.out.println(book1);

        Book book2 = new Book("Toprak", 2020, "Robert Seethaler");
        System.out.println("\n*** Second Book ***\n");
        System.out.println(book2);

        Book book3 = new Book("Hayvan Çiftliği");
        System.out.println("\n*** Third Book ***\n");
        System.out.println(book3);


    }
}
