public class Main {
    public static void main(String[] args) {
        Author margaretMitchell = new Author("Margaret", "Mitchell");
        Author johnRonaldReuelTolkien = new Author("John Ronald Reuel", "Tolkien");
        Book goneWithTheWind = new Book("Gone With The Wind", margaretMitchell, 2023);
        Book theLordOfTheRings = new Book("The Lord of the Rings", johnRonaldReuelTolkien, 2020);
        System.out.println("название книги: " + goneWithTheWind.getTitle());
        System.out.println("автор: " + goneWithTheWind.getAuthor().getName() + " " + goneWithTheWind.getAuthor().getSurname());
        System.out.println("год издания: " + goneWithTheWind.getPublishingYear());
        goneWithTheWind.setPublishingYear(2024);
        System.out.println("после изменения, год издания: " + goneWithTheWind.getPublishingYear());
        System.out.println();
        System.out.println("название книги: " + theLordOfTheRings.getTitle());
        System.out.println("автор: " + theLordOfTheRings.getAuthor().getName() + " " + theLordOfTheRings.getAuthor().getSurname());
        System.out.println("год издания: " + theLordOfTheRings.getPublishingYear());
    }
}