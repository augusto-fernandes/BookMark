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

      Book b1 = new Book(null,"Harry potter",800,"link",false);
      Book b2 = new Book(null,"Joao e maria",300,"link2",true);
      Book b3 = new Book(null,"branca de neve",500,"link2",false);
      Book b4 = new Book(null,"percy jackson",200,"link2",true);

      repository.saveAll(Arrays.asList(b1,b2));
    }

}
