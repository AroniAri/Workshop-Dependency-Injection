package se.lexicon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Configuration
public class AppConfig {

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }

}
