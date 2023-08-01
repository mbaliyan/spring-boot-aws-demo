package com.java.techie.aws.springbootawsdemo.repository;

import com.java.techie.aws.springbootawsdemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}