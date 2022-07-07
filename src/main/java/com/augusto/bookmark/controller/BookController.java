package com.augusto.bookmark.controller;

import com.augusto.bookmark.domain.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "books")
public class BookController {

    @GetMapping(value = "{id}")
    public ResponseEntity<Book> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(new Book(1,"Harry potter",100,"link"));
    }
}
