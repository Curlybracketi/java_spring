package net.javaguides.springboot.springboothelloworldtutorial.Repositries;

import net.javaguides.springboot.springboothelloworldtutorial.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Long > {

}
