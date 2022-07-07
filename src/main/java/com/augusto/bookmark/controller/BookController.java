package com.augusto.bookmark.controller;

import com.augusto.bookmark.domain.Book;
import com.augusto.bookmark.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping(value = "{id}")
    public ResponseEntity<Book> findById(@PathVariable Integer id){
        Book book = service.findById(id);
        return ResponseEntity.ok().body(book);
    }

    @GetMapping(value = "/reading")
    public ResponseEntity<List<Book>>listReading(){
        List<Book> list = service.findAllReading();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/read")
    public ResponseEntity<List<Book>> listRead(){
        List<Book> list = service.findAllRead();
        return ResponseEntity.ok().body(list);
    }
}
