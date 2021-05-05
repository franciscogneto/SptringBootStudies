package com.example.demo.model;

/**
 * Book
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private String publishing_company;
    private String year;

    public Book() {
    }

    public Book(String title, String author, String publishing_company, String year) {
        this.title = title;
        this.author = author;
        this.publishing_company = publishing_company;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing_company() {
        return publishing_company;
    }

    public void setPublishing_company(String publishing_company) {
        this.publishing_company = publishing_company;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + title + ", Autor: " + author + ",ano: " + year + ",Editora: "
                + publishing_company;

    }
}