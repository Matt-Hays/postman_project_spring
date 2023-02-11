package hays.matthew.postman_setup.services;

import hays.matthew.postman_setup.domain.Book;

public interface BookService {

    Book addNewBook(Book book);

    Iterable<Book> getAll();

}
