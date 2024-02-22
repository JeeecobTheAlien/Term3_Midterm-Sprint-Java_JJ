package library;

public interface Borrowable {
    boolean borrowBook(int numCopies);

    boolean returnBook(int numCopies);
}
