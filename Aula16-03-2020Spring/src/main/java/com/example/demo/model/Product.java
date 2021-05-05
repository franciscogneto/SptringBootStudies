package com.example.demo.model;

/**
 * Product
 */
public class Product {
    private int code;
    private String name;
    private double value;
    private int stock;

    public Product(int code, String name, double value) {
        this.code = code;
        this.name = name;
        this.value = value;
    }

    public Product(int code, String name, double value, int stock) {
        this.code = code;
        this.name = name;
        this.value = value;
        this.stock = stock;
    }

    public int getCode(){
        return this.code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + code;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (code != other.code)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Código: " + code + ",  Nome: " + name + " "+ ",  Quantidade em estoque: " + stock + " UN " + ",  Valor: " + value + "  R$";
    }

    

    

    
    
}