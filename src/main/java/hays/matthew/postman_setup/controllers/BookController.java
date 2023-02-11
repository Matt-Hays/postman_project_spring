package hays.matthew.postman_setup.controllers;

import hays.matthew.postman_setup.domain.Book;
import hays.matthew.postman_setup.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public Book addNewBookToAuthor(@RequestBody Book book) {
        return bookService.addNewBook(book);
    }

}
