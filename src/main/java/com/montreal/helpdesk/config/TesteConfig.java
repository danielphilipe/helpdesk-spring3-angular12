package com.montreal.helpdesk.config;

import com.montreal.helpdesk.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TesteConfig {

    @Autowired
    private DBService dbService;

    @Bean
    public DBService instanciaDB(){
        return this.dbService.instanciaDB();
    }
}
