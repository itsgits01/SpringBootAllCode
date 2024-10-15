package org.example.springtutorialutube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialUtubeApplication {

    public static void main(String[] args) {

        ApplicationContext context= SpringApplication.run(SpringTutorialUtubeApplication.class, args);

        Dev object= context.getBean(Dev.class);


        object.build();
    }

}
