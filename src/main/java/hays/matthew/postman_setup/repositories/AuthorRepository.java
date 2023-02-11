package hays.matthew.postman_setup.repositories;

import hays.matthew.postman_setup.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
