package Composition;

import java.awt.print.Book;

public class Test_Book {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
        System.out.println(ahTeck);

        BookClass dummyBook = new BookClass ("Java for dummies", ahTeck, 9.99, 99);
        System.out.println(dummyBook);
        dummyBook.setPrice(8.88);
        dummyBook.setQty(88);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("author is: " + dummyBook.getAuthor());
        System.out.println("author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
        System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());

        BookClass moreDummyBook = new BookClass("Java for more dummies", new Author("Peter Lee","gdhgs@bdhd.com", 'm'), 19.99, 8);
        System.out.println(moreDummyBook);
    }
}
