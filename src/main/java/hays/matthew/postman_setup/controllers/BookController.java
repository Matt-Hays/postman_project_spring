package hays.matthew.postman_setup.controllers;

import hays.matthew.postman_setup.domain.Book;
import hays.matthew.postman_setup.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;


    @GetMapping
    @ResponseBody
    public Iterable<Book> getAllBooks(){
        return bookService.getAll();
    }

    @PostMapping
    @ResponseBody
    public Book addNewBookToAuthor(@RequestParam Long authorId, @RequestBody Book book) {
        return bookService.addNewBook(book, authorId);
    }

    @PostMapping("/{authorId}")
    @ResponseBody
    public Iterable<Book> addMultipleBooksToAuthor(@PathVariable Long authorId, @RequestBody Set<Book> books){
        return bookService.addMultipleBooks(books, authorId);
    }

}
