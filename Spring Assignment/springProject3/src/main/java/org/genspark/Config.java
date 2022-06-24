package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public student getstu(){
        return new student();
    }
    @Bean
    public Address getadd(){
        return new Address();
    }
    @Bean
    public Phone getph(){
        return new Phone();
    }

}
