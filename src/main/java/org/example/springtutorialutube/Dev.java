package org.example.springtutorialutube;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    //@Autowired //field injection  autowired is necessary for field injection
    // and setter inejction but not necessary for constructor injection.
    @Autowired
    @Qualifier("desktop")
    private Computer comp;


//    @Autowired
//    public Dev(Laptop laptop) { //constrcutor injection
//        this.laptop = laptop;
//    }

//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop=laptop;
//    }

    public void build(){

        comp.compile();

        System.out.println("Working on Project");
    }
}
