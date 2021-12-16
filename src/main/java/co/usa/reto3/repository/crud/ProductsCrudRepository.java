package co.usa.reto3.repository.crud;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.usa.reto3.model.Products;

public interface ProductsCrudRepository extends MongoRepository<Products, Integer>{
    
    
}
