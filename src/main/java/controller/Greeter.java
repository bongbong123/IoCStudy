package controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Greeter {
    private String format;

    @Bean
    public String greet(String guest){
        return guest;
    }

    @Bean
    public void setFormat(String format){
        this.format = format;
    }

    @Bean
    public String getFormat(){
        return format;
    }
}
