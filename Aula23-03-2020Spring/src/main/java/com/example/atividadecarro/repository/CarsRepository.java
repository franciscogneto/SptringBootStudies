package com.example.atividadecarro.repository;


import java.util.HashMap;

import com.example.atividadecarro.model.Car;

import org.springframework.stereotype.Repository;

/**
 * CarsRepository
 */
@Repository
public class CarsRepository {

    HashMap<Integer,Car> cars = new HashMap<>();

    public CarsRepository(){
        cars.put(1, new Car(1, 50000, "HB-20", "Flex",2017, "FTS-5452"));
        cars.put(2, new Car(2, 36900, "Saveiro", "Cross",2016, "GTS-7896"));
        cars.put(3, new Car(3, 116000, "BMW", "320i",2018 ,"BCH-3652"));
        cars.put(4, new Car(4, 24999, "Gol", "Quadrado",2004, "DJH-6412"));
        cars.put(5, new Car(5, 61900, "Jeep", "Renegade",2015, "AND-3625"));
        
    }

    public Car getCarById(int id){
        return cars.get(id);
    }

    public HashMap<Integer,Car> getCars(){

        return cars;
    }
}