package hays.matthew.postman_setup.services;

import hays.matthew.postman_setup.domain.Author;


public interface AuthorService {
    Iterable<Author> getAllAuthors();

    Author addNewAuthor(Author author);
}
