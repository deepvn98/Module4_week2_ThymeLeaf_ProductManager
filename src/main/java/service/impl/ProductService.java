package service.impl;

import model.Product;
import org.springframework.stereotype.Service;
import service.IProductService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {
    private static List<Product> productList = new ArrayList<>();
    static {
        Product product1 = new Product(1,"Iphone11",1200000,"","Apple");
        Product product2 = new Product(2,"Iphone12",1200000,"","Apple");
        Product product3 = new Product(3,"Iphonex",1200000,"","Apple");
        Product product4 = new Product(4,"SamsungNote5",1200000,"","Samsung");
        Product product5 = new Product(5,"SamsungGalaxy",1200000,"","Samsung");
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

    }


    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);

    }

    @Override
    public void update(int id, Product product) {
        productList.set(id,product);

    }

    @Override
    public void remove(int id) {
        productList.remove(id);

    }

    @Override
    public Product findProduct(int id) {
        Product product = productList.get(id);
        return product;
    }
}
