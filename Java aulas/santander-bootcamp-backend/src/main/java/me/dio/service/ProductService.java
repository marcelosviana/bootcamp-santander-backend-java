package me.dio.service;

import jakarta.transaction.Transactional;
import me.dio.model.Product;

import java.util.List;

public interface ProductService {

    void createProduct (Product createToProduct);


    Product findById(Long id) throws NoSuchFieldException;

    Product  getProductById (Long id);

    @Transactional
    void deleteProduct(Long Id);


    List<Product> listAllProducts();
}
