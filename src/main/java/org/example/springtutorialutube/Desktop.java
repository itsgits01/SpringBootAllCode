package org.example.springtutorialutube;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void compile(){
        System.out.println("Compling with 404 bugs with desktop");
    }
}
