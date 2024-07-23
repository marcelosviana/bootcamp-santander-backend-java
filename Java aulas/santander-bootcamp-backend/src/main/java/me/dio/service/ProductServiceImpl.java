package me.dio.service;

import me.dio.model.Product;
import me.dio.repository.ProductRepository;
import me.dio.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public Product findById(Long id) throws NoSuchFieldException {
        return productRepository.findById(id).orElseThrow(NoSuchFieldException::new);
    }
    @Override
    public void createProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }
}
