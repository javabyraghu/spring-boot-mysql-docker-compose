package com.app.raghu.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.raghu.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
