package com.rafaelmacedo.bookstoremanager.repository;

import com.rafaelmacedo.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
