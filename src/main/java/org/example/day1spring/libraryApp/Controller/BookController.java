package org.example.day1spring.libraryApp.Controller;

import org.example.day1spring.BookAPI.Model.Book;
import org.example.day1spring.libraryApp.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/books")
public class BookController {

    private final LibraryService libraryService;

    @Autowired
    public BookController(LibraryService libraryService){
        this.libraryService = libraryService;
    }

    @PostMapping
    public void addBook(@RequestBody Book book){
        libraryService.addBook(book);
    }

    @GetMapping("/{isbn}")
    public Book getBook(@PathVariable String isbn){
        return libraryService.getBook(isbn);
    }
}