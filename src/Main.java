public class Main {
    public static void main(String[] args) {
        Author margaretMitchell = new Author("Margaret", "Mitchell");
        Author johnRonaldReuelTolkien = new Author("John Ronald Reuel", "Tolkien");
        Book goneWithTheWind = new Book("Gone With The Wind", margaretMitchell, 2023);
        Book theLordOfTheRings = new Book("The Lord of the Rings", johnRonaldReuelTolkien, 2020);

        System.out.println(margaretMitchell);
        System.out.println(johnRonaldReuelTolkien);
        System.out.println(goneWithTheWind);
        System.out.println(theLordOfTheRings);
    }
}