package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@EntityScan("io.javabrains.springbootstarter.topic")
@EnableJpaRepositories("io.javabrains.springbootstarter.topic")
@ComponentScan("io.javabrains.springbootstarter.topic")
public class CourseApiApp {

    public static void main(String[] args) {
        SpringApplication.run(CourseApiApp.class, args);
    }

}
