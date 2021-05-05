package com.example.demo.controller;
import com.example.demo.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProductController
 */
@Controller
@RequestMapping("")
public class ProductController {

    @Autowired
    private ProductService ps;

    @GetMapping("/produto/{code}")
    public ModelAndView getProduct(
        @PathVariable("code") int code
    ){
        
        ModelAndView mv = new ModelAndView("produto");
        mv.addObject("product", ps.getProduct(code));
        return mv;
    }

    @GetMapping("/produtosEmEstoque")
    public ModelAndView productInStock(){
        ModelAndView mv = new ModelAndView("produtosEmEstoque");
        mv.addObject("products", ps.getProductsInStock());
        return mv;
    }

    @GetMapping("/produtosValorAcima/{value}")
    public ModelAndView productsValueAbove(
        @PathVariable("value") double value
    ){
        ModelAndView mv = new ModelAndView("produtosValorAcima");
        mv.addObject("products", ps.getProductsByValueAbove(value));
        return mv;
    }

    @GetMapping("/produtosValorAbaixo/{value}")
    public ModelAndView productsValueBelow(
        @PathVariable("value") double value
    ){

        ModelAndView mv = new ModelAndView("produtosValorAbaixo");
        mv.addObject("products", ps.getProductsByValueBelow(value));

        return mv;
    }
    
    
}