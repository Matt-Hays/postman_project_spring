package hays.matthew.postman_setup.controllers;

import hays.matthew.postman_setup.domain.Author;
import hays.matthew.postman_setup.domain.Book;
import hays.matthew.postman_setup.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @PostMapping
    public Book addNewBookToAuthor(@RequestBody Book book) {
        return bookService.addNewBook(book);
    }

}
