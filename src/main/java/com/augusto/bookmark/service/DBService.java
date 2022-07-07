package com.augusto.bookmark.service;

import com.augusto.bookmark.domain.Book;
import com.augusto.bookmark.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {
    @Autowired
    BookRepository repository;
    public void instanciaBaseDeDados(){

      Book b1 = new Book(null,"Harry potter",100,"link");
      Book b2 = new Book(null,"Teste",101,"link2");

      repository.saveAll(Arrays.asList(b1,b2));
    }

}
