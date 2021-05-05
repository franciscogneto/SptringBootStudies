package com.example.atividadecarro.service;

import java.util.ArrayList;

import com.example.atividadecarro.model.Car;
import com.example.atividadecarro.repository.CarsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CarService
 */
@Service
public class CarService {
    @Autowired
    private CarsRepository cars;

    public Car getCar(int id) {
        return cars.getCarById(id);
    }

    public ArrayList<Car> getCars() {
        ArrayList<Car> aux = new ArrayList<>(cars.getCars().values());

        if (aux.isEmpty())
            return null;
        return aux;
    }

}