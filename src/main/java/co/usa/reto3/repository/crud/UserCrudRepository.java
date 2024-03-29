package co.usa.reto3.repository.crud;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import co.usa.reto3.model.User;


public interface UserCrudRepository extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    Optional<User> findTopByOrderByIdDesc();
    
}
