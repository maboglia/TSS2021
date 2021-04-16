package relazioni.repo;



import org.springframework.data.repository.CrudRepository;

import relazioni.entities.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByIsbn(String isbn);
}