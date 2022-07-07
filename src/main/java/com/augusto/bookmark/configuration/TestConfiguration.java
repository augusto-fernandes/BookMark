package com.augusto.bookmark.configuration;

import com.augusto.bookmark.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfiguration {

    @Autowired
    private DBService dbService;

    @Bean
    public boolean instancia(){
        this.dbService.instanciaBaseDeDados();
        return true;
    }
}
