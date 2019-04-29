package com.company;

// A class car inherits a class Vehicle
public class Car extends Vehicle {

    private String make;
    private int year;

    public Car() {
        super();
        System.out.println("A car has 4 wheels ");
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }
    @Override
    public String stops () {
        return "A car stops";
    }
    @Override
    public void setMake(String make){
        this.make = make;
    }
    @Override
    public String getMake(){
        return make;
    }
    @Override
    public void SetYear (int year){
        this.year = year;
    }
}
