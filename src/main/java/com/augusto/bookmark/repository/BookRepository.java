package com.augusto.bookmark.repository;

import com.augusto.bookmark.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query("SELECT obj FROM Book obj WHERE obj.complete = false")
   List<Book> findAllReading();

    @Query("SELECT obj FROM Book obj WHERE obj.complete = true")
    List<Book>findAllRead();
}
