package com.otakun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.otakun.dao.AnimeDao;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.otakun.dao")
@EntityScan(basePackages = "com.otakun.model")
public class BasicApplication {

    @Autowired
    private AnimeDao repositorio;
    
    private static BasicApplication basicApplication;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BasicApplication.class, args);
        BasicApplication.basicApplication = context.getBean(BasicApplication.class);
    }

    public static BasicApplication getBasicApplication() {
        return BasicApplication.basicApplication ;
    }
    
    public AnimeDao getAnimeDao(){
        return this.repositorio;
    }

}
