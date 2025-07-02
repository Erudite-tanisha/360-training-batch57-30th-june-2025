package org.training.Session2_Spring.Boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.training.Session2_Spring.Boot.Animal;

@Configuration
public class MyConfig {

    @Bean
    public Animal animal(){
        return new Animal();
    }


}
