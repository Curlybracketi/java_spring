package net.javaguides.springboot.springboothelloworldtutorial.Services;

        import net.javaguides.springboot.springboothelloworldtutorial.Product;

        import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();

    Product getProductById(long id);

    Product createProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(long id);
}
