package hays.matthew.postman_setup.services;

import hays.matthew.postman_setup.domain.Author;


public interface AuthorService {
    public Iterable<Author> getAllAuthors();

    public Author addNewAuthor(Author author);
}
