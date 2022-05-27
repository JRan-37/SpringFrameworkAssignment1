package org.genspark.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class StudentConfig {

    @Bean
    public Student getStudent() {
        return new Student();
    }

    @Bean
    public Phone getPhone() {
        return new Phone();
    }

    @Bean
    public Address getAddress() {
        return new Address();
    }


}

