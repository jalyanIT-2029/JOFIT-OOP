package Activity1;

public class BookMain {
    public static void main(String[] args) {

        Book book1 = new Book(" ", " ", " ", " ");
        book1.title = "Hell University";
        book1.author = "Raymond Velasco (KnightinBlack)";
        book1.isbn = "9786214140756";
        book1.publicationDate = "February 2016";

        Book book2 = new Book(" ", " ", " ", " ");
        book2.title = "The Rain In España";
        book2.author = "Gwy Saludes (4reuminct)";
        book2.isbn = "9786210309171";
        book2.publicationDate = "January 2019";

        Book book3 = new Book(" ", " ", " ", " ");
        book3.title = "Safe Skies, Archer";
        book3.author = "Gwy Saludes (4reuminct)";
        book3.isbn = "9786214140756";
        book3.publicationDate = "February 2016";

        Book book4 = new Book(" ", " ", " ", " ");
        book4.title = "Golden Scenery of Tomorrow";
        book4.author = "Gwy Saludes (4reuminct)";
        book4.isbn = "9786210309171";
        book4.publicationDate = "January 2019";

        System.out.println("              BOOK");
        System.out.println("--------------------------------");
        book1.printBookInfo();
        book2.printBookInfo();
        book3.printBookInfo();
        book4.printBookInfo();

    }
}
