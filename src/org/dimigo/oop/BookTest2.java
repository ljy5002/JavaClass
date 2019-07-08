package org.dimigo.oop;

public class BookTest2 {
    public static void ChangeRefernce(Book book) {
        book.setTitle("자바를 잡아라");
        System.out.println("book2 : " + book.getTitle());
    }

    public static void main(String[] args) {
            Book book = new Book();
        Book book2 = book;
        book.setTitle("가나다라마바사");
        System.out.println("book = " + book.getTitle());
        ChangeRefernce(book2);
        System.out.println("book : "+book.getTitle());
    }
}
