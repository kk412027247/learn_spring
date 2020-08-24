package com.wangluoguimi;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("singleton")
@Scope("prototype")
//@Lazy
public class Notepad2 {
    public Notepad2() {
        super();
        System.out.println("Notepad constructor " + this.toString());
    }

    @PostConstruct
    public void init(){
        System.out.println("Notepad2 init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Notepad2 destroy");
    }

}
