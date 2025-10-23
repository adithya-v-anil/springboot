package com.example.mydata.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.mydata.Models.ProductModel;

public interface ProductRepository extends CrudRepository<ProductModel,Integer> {

}
