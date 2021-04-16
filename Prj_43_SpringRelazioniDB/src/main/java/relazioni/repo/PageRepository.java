package relazioni.repo;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import relazioni.entities.Book;
import relazioni.entities.Page;

import java.util.List;

public interface PageRepository extends CrudRepository<Page, Long> {

    List<Page> findByBook(Book book, Sort sort);
}