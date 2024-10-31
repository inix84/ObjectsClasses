import java.util.Objects;

public class Book {
    private final String title; // название
    private final Author author;// автор
    private int publishingYear; // год издания

    public Book(String title, Author author, int publishingYear) { // конструкторы
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    // геттеры
    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    // сеттер
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Книга: " +
                "Название - '" + title + "'" +
                ", " + author +
                ",  Издательство - " + publishingYear + " г.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishingYear);
    }
}
