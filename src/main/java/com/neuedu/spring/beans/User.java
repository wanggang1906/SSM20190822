package com.neuedu.spring.beans;


public class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String SayHello(){
        System.out.println("hello" + name);
        return "true";
    }
}
