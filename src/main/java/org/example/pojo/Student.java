package org.example.pojo;

public record Student(
        String name,
        int rollNumber){

    public Student(String name){
        this(name, 1);
    }

    public void greetings(){
        System.out.println("Hello! This is "+name);
    }
}
