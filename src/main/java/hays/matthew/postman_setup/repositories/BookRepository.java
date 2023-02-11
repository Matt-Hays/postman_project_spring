package hays.matthew.postman_setup.repositories;

import hays.matthew.postman_setup.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
