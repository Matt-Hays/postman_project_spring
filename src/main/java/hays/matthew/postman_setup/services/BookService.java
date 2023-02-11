package hays.matthew.postman_setup.services;

import hays.matthew.postman_setup.domain.Book;

import java.util.Set;

public interface BookService {

    Book addNewBook(Book book, Long authorId);

    Iterable<Book> addMultipleBooks(Set<Book> books, Long authorId);

    Iterable<Book> getAll();

}
