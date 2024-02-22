package library;

import java.util.ArrayList;
import java.util.List;
import library.Book;
import library.Author;
import library.Patron;


public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        Author author = book.getAuthor();
        if (!authors.contains(author)) {
            authors.add(author);
        }
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public List<Book> searchBooksByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public List<Book> searchBooksByAuthor(String authorName) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getName().equalsIgnoreCase(authorName)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public Book searchBooksByISBN(String isbn) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void removePatron(Patron patron) {
        patrons.remove(patron);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void borrowBook(Book book, Patron patron) {
        patron.borrowBook(book);
    }

    public void returnBook(Book book, Patron patron) {
        patron.returnBook(book);
    }
}