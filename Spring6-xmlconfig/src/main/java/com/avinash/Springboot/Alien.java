package com.avinash.Springboot;

public class Alien {
    //Instance variables
    private int age;
    private String name;
    private Laptop lap;

    //Constructor

    //Normal
    public Alien(){
        System.out.println("Alien is created...!");
    }

    //Parameter Constructor

    //age
    public Alien(int age){
        this.age = age;
        this.name = "";
        this.lap = null;
    }

    //name
    public Alien(String name){
        this.name = name;
        this.age = 0;
        this.lap = null;
    }

    //laptop
    public Alien(Laptop lap){
        this.lap = lap;
        this.name = "";
        this.age = 0;
    }

    //setters

    //setAge()
    public void setAge(int age){
        System.out.println("setAge();");
        this.age = age;
    }

    //setName()
    public void setName(String name){
        System.out.println("setName();");
        this.name = name;
    }

    //setLap()
    public void setLap(Laptop lap){
        System.out.println("setLap();");
        this.lap = lap;
    }

    //getters

    //getAge()
    public int getAge(){
        System.out.println("age : "+this.age);
        return this.age;
    }

    //getName()
    public String getName(){
        System.out.println("Name : "+this.name);
        return this.name;
    }

    //getLap()
    public Laptop getLap(){
        System.out.println("Lap : "+this.lap);
        return this.lap;
    }

    //compile
    public void compile(){
        System.out.println("compiling...");
    }
}
