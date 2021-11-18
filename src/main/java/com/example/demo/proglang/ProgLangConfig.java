package com.example.demo.proglang;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProgLangConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProgLangRepository repository){
        return args -> {
            ProgLang java = new ProgLang(
                    "Java",
                    4
            );

            ProgLang python = new ProgLang(
                    "python",
                    5
            );

            repository.saveAll(
                    List.of(java, python)
            );

        };
    }
}
