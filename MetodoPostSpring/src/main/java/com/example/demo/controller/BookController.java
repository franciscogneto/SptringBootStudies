package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * BookController
 */
@Controller
@RequestMapping("/app")
public class BookController {

    @Autowired
    private BookService bs;

    @PostMapping("/cadastra")
    public ModelAndView cadastraForm(@ModelAttribute Book book) {
        boolean insert;
        ModelAndView mv = new ModelAndView("redirect:/app/cadastra");
        insert = bs.addBook(book);
        mv.addObject("livros", bs.getBooks());
        mv.addObject("inserido", insert);
        return mv;
    }

    @GetMapping("/cadastra")
    public ModelAndView getBooks() {
        ModelAndView mv = new ModelAndView("cadastra");
        mv.addObject("livros", bs.getBooks());
        mv.addObject("inserido", true);
        
        return mv;
    }

}