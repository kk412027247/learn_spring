package com.wangluoguimi;

public class Notepad {
    public Notepad() {
        super();
        System.out.println("Notepad constructor " + this.toString());
    }

    public void init(){
        System.out.println("Notepad init");
    }

    public void destroy(){
        System.out.println("Notepad destroy");
    }
}

