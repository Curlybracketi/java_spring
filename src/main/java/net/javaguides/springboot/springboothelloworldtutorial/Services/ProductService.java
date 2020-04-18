package net.javaguides.springboot.springboothelloworldtutorial.Services;

import net.javaguides.springboot.springboothelloworldtutorial.Product;

public interface ProductService {
    Object getAllProduct();

    Object getProductById(long id);

    Object createProduct(Product product);

    Object updateProduct(Product product);

    void deleteProduct(long id);
}
