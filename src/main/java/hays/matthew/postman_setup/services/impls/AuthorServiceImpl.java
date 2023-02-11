package hays.matthew.postman_setup.services.impls;

import hays.matthew.postman_setup.domain.Author;
import hays.matthew.postman_setup.repositories.AuthorRepository;
import hays.matthew.postman_setup.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    @Override
    public Iterable<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author addNewAuthor(Author author) {
        return authorRepository.save(author);
    }
}
