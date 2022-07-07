package com.augusto.bookmark.service;

import com.augusto.bookmark.domain.Book;
import com.augusto.bookmark.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public Book findById(Integer id){
        Optional<Book> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
