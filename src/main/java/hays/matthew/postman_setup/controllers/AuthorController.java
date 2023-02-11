package hays.matthew.postman_setup.controllers;

import hays.matthew.postman_setup.domain.Author;
import hays.matthew.postman_setup.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping
    @ResponseBody
    public Iterable<Author> getAuthors() {
        return authorService.getAllAuthors();
    }

    @PostMapping
    @ResponseBody
    public Author createANewAuthor(@RequestBody Author author) {
        return authorService.addNewAuthor(author);
    }
}
