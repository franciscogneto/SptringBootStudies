package com.example.demo.repository;


import java.util.HashMap;

import com.example.demo.model.Product;

import org.springframework.stereotype.Repository;

/**
 * ProductRepository
 */
@Repository
public class ProductRepository {

    HashMap<Integer,Product> products = new HashMap<>();

    public ProductRepository(){
        products.put(1, new Product(1, "Coca-Cola", 7.5,2));
        products.put(2, new Product(2, "Arroz", 11,10));
        products.put(3, new Product(3, "Farinha de trigo", 4.5,4));
        products.put(4, new Product(4, "Carvão", 13.0,4));
        products.put(5, new Product(5, "Fanta", 7.0,6));
        products.put(6, new Product(6, "Pepsi", 6.5,0));
        products.put(7, new Product(7, "Feijão", 9.90,8));
        products.put(8, new Product(8, "Saco de ração de gato", 55.9,0));
        products.put(9, new Product(9, "Saco de ração de cachorro", 49.9,10));
        products.put(10, new Product(10, "Cerveja stella 269ml", 6.0,4));
    }
    public Product getProductbyId(int id){
        return products.get(id);
    }
    
    public HashMap<Integer,Product> getProducts(){
        return products;
    }
}