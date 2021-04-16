package relazioni.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import relazioni.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByNameContaining(String name);
}