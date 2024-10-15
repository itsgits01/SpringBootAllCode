package org.example.day1spring.libraryApp.Service;

import org.example.day1spring.BookAPI.Model.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LibraryService {
    private final Map<String, Book> bookStore = new HashMap<>(); // In-memory storage for books

    // Method to add a book
    public void addBook(Book book) {
        bookStore.put(book.getIsbn(), book); // Store the book by ISBN
        System.out.println("Book added: " + book); // Debug print to confirm addition
    }

    // Method to get a book by ISBN
    public Book getBook(String isbn) {
        return bookStore.get(isbn); // Retrieve the book from storage
    }
}
