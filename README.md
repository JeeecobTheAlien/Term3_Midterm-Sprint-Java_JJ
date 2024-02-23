User Documentation

Introduction

The Library System Developed is a Java application designed to ease the management of books, authors, and patrons done in a library. It features the capility of adding, editing, and deleting books and authors, managing patrons, and facilitating book borrowing and returning.

Class Descriptions

Book: Represents a book in the library. It includes properties such as title, author, ISBN, publisher, and number of copies. Implements the Borrowable interface.

Author: Represents an author. Contains the ability to add/remove values such as name, date of birth, and a list of books they have written.

Patron: Represents a library patron. Includes the ability to add/remove values like name, address, phone number, and a list of borrowed books.

Library: Manages books, authors, and patrons. Provides methods to search for books by title, author, or ISBN, and to borrow and return books.

Functionality

Book Management: Add, edit, and delete books from the library inventory.
Author Management: Add, edit, and delete authors from the library database.
Patron Management: Add, edit, and delete patrons from the library records.
Book Borrowing: Patrons can search for books by title, author, or ISBN and borrow specific copies.
Book Returning: Patrons can return books they have borrowed.
