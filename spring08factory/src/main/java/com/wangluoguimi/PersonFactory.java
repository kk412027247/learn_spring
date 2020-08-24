package com.wangluoguimi;

public class PersonFactory {

    public static Person createPerson1(){
        System.out.println("static factory create person");
        return new Person();
    }

    public Person createPerson2(){
        System.out.println("instance factory create person");
        return new Person();
    }

}
