package com.example.mybook.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.mybook.Models.BookModel;

public interface BookRepository extends CrudRepository<BookModel,Integer> {

}
