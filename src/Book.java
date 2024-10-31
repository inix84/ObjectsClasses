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
}
