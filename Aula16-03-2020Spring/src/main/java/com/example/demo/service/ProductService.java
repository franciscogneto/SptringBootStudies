package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * ProductService
 */
@Service
public class ProductService {
    
    @Autowired
    private ProductRepository pr;

    
    public Product getProduct(int code){
        return pr.getProductbyId(code);
    }

   
    public ArrayList<Product> getProductsInStock(){

        ArrayList<Product> products = new ArrayList<>();
        for(Product aux: pr.getProducts().values()){
            if(aux.getStock() > 0)
                products.add(aux);
        }
        if(products.isEmpty())
            return null;
        else
            return products;
        
    }

    
    public ArrayList<Product> getProductsByValueAbove(double value){
        ArrayList<Product> products = new ArrayList<>();
        for(Product aux: pr.getProducts().values()){
            if(aux.getValue() > value)
                products.add(aux);
        }
        if(products.isEmpty())
            return null;
        else
            return products;
    }

       
    public ArrayList<Product> getProductsByValueBelow(double value){
        ArrayList<Product> products = new ArrayList<>();
        for(Product aux: pr.getProducts().values()){
            if(aux.getValue() < value)
                products.add(aux);
        }
        if(products.isEmpty())
            return null;
        else
            return products;
    }
}