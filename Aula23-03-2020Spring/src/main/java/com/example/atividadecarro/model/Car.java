package com.example.atividadecarro.model;

/**
 * Car
 */
public class Car {

    private int id;
    private double value;
    private int year;
    private String name;
    private String model;
    private String board;

    public Car(int id, double value, String name, String model,int year ,String board) {
        this.id = id;
        this.value = value;
        this.name = name;
        this.model = model;
        this.board = board;
        this.year = year;
    }

    

    
    @Override
    public String toString() {
        return "Carro: " + id +";  nome: " + name + ";  modelo:  " + model + "  Ano:  "+ year + ";  Placa:  " + board +   ";  Valor:  " + value + "  R$";
    }

    


    
    
}