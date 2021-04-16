package relazioni.repo;

import org.springframework.data.repository.CrudRepository;

import relazioni.entities.Address;

public interface AddressRepo extends CrudRepository<Address, Long> {

}
