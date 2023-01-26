package Day28._02_Constructor;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book() {
    }

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public Book(String name) {
        this(name, 0, "");
    }

    public String toString() {
        return name + " " + author + " " + publishYear;
    }
}
