package hays.matthew.postman_setup.services;

import hays.matthew.postman_setup.domain.Author;

import java.util.Set;


public interface AuthorService {
    Iterable<Author> getAllAuthors();

    Iterable<Author> addManyAuthors(Set<Author> authors);

    Author addNewAuthor(Author author);
}
