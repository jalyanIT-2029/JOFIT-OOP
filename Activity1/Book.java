package Activity1;

public class Book {
    String title;
    String author;
    String isbn;
    String publicationDate;

    public Book(String bookTitle, String bookAuthor, String bookIsbn, String bookPublicationDate) {
        title = bookTitle;
        author = bookAuthor;
        isbn = bookIsbn;
        publicationDate = bookPublicationDate;

    }

    void printBookInfo() {
        System.out.println();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Publication Date: " + publicationDate);
    }

    /*
     * void printBookInfo() {
     * System.out.printf("""
     * 
     * Title : %s
     * Author : %s
     * ISBN : %s
     * Publication Date : %s
     * """, title, author, isbn, publicationDate);
     */
}
