package com.example.atividadecarro.controller;

import com.example.atividadecarro.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class CarController {

    @Autowired
    private CarService cs;

    @GetMapping("/cars/{id}")
    public ModelAndView getCar(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("carro");
        mv.addObject("car", cs.getCar(id));
        return mv;
    }

    @GetMapping("/cars")
    public ModelAndView getCars() {
        ModelAndView mv = new ModelAndView("carrosDisponiveis");
        mv.addObject("cars", cs.getCars());
        return mv;
    }

}