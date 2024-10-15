package org.example.day1spring.libraryApp.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class BeanRetrievalService {
    private final ApplicationContext context;

    @Autowired
    public  BeanRetrievalService(ApplicationContext context) {
        this.context = context;
    }
    public <T> T getBean(Class<T> beanClass){
        return context.getBean(beanClass);
    }

}
