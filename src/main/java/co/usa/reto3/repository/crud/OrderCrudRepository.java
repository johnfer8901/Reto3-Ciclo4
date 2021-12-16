package co.usa.reto3.repository.crud;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import co.usa.reto3.model.Order;

/**
 *
 * @author John F
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer> {
    
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String zona);    
    
    Optional<Order> findTopByOrderByIdDesc();
}
