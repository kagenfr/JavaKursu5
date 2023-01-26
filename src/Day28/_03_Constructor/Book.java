package Day28._03_Constructor;
//Sağ tık-Generate-Constructor dediğimizde yapmak istediğimiz her şeyi kenidisi yapıyor.
//Sağ tık-Generate-toString dediğimizde bize bu metodu veriyor.
//Generate seçeneğiyle birlikte işimiz daha da kolaylaşıyor.
public class Book {
    String name;
    int publishYear;
    String author;

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }
}
