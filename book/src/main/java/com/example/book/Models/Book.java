package com.example.book.Models;

public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private String publishedDate;

    public Book() {
    	super();
    }

    public Book(String title, String author, String description, double price, String publishedDate) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.publishedDate = publishedDate;
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

    public String getDescription() { 
    	return description; 
    }
    
    public void setDescription(String description) { 
    	this.description = description; 
    	}

    public double getPrice() { 
    	return price; 
    	}
    
    public void setPrice(double price) { 
    	this.price = price; 
    	}

    public String getPublishedDate() { 
    	return publishedDate; 
    	}
    
    public void setPublishedDate(String publishedDate) { 
    	this.publishedDate = publishedDate; 
    	}
}
