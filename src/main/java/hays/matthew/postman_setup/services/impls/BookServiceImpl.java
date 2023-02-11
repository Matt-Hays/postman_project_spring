package hays.matthew.postman_setup.services.impls;

import hays.matthew.postman_setup.domain.Author;
import hays.matthew.postman_setup.domain.Book;
import hays.matthew.postman_setup.repositories.AuthorRepository;
import hays.matthew.postman_setup.repositories.BookRepository;
import hays.matthew.postman_setup.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Override
    public Book addNewBook(Book book, Long authorId) {
        Optional<Author> authorOptional = authorRepository.findById(authorId);
        if (authorOptional.isPresent()) {
            book.setAuthor(authorOptional.get());
            return bookRepository.save(book);
        } else return null;
    }

    @Override
    public Iterable<Book> getAll() {
        return bookRepository.findAll();
    }
}
