package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class student {
    @Id
    private int id;
    private String name;
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public student(){
    }
    public student(int id, String name){
    
    this.id=id;
    this.name=name;
    }
}