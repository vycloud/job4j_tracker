package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Head First Java", 656);
        Book book2 = new Book("Java For Dummies", 434);
        Book book3 = new Book("Effective Java ", 416);
        Book book4 = new Book("Clean code", 464);
        Book[] books = {book1, book2, book3, book4};
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + ", " + book.getPages() + " pages");
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + ", " + book.getPages() + " pages");
        }
        System.out.println();
        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + ", " + book.getPages() + " pages");
            }
        }
    }
}
