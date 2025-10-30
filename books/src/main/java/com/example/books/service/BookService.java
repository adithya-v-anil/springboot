package com.example.books.service;

import com.example.books.Models.Book;
import com.example.books.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public Book addBook(Book book) {
        return repository.save(book);
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return repository.findById(id);
    }

    public Book updateBook(Long id, Book updatedBook) {
        return repository.findById(id).map(book -> {
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setGenre(updatedBook.getGenre());
            book.setPrice(updatedBook.getPrice());
            book.setPublishedDate(updatedBook.getPublishedDate());
            return repository.save(book);
        }).orElse(null);
    }

    public void deleteBook(Long id) {
        repository.deleteById(id);
    }

    public List<Book> searchBooks(String keyword) {
        return repository.findByTitleContainingIgnoreCase(keyword);
    }
}
