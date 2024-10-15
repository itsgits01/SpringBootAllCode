package org.example.day1spring.libraryApp.Controller;

import org.example.day1spring.BookAPI.Model.Book;
import org.example.day1spring.libraryApp.Service.BeanRetrievalService;
import org.example.day1spring.libraryApp.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final BeanRetrievalService beanRetrievalService;

    @Autowired
    public AdminController(BeanRetrievalService beanRetrievalService){
        this.beanRetrievalService =beanRetrievalService;
    }
    @PostMapping("/books")
    public void addBook(@RequestBody Book book){
        LibraryService libraryService =beanRetrievalService.getBean(LibraryService.class);
        libraryService.addBook(book);
    }

    @GetMapping("/books/{isbn}")
    public Book getBook(@PathVariable String isbn){
        LibraryService libraryService=beanRetrievalService.getBean(LibraryService.class);
        return libraryService.getBook(isbn);
    }
}
