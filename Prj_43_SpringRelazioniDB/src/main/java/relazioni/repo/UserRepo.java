package relazioni.repo;

import org.springframework.data.repository.CrudRepository;

import relazioni.entities.User;

public interface UserRepo extends CrudRepository<User, Long> {

}
