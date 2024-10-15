package org.example.springtutorialutube;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compling with 404 bugs with laptop");
    }
}
