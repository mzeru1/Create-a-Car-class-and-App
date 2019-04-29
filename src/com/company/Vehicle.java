package com.company;

public class Vehicle {

    private String make;
    private int year;
// default constractor. if we don't have this writen java will create it for us
    // however since I overrided it at the bottom, I have to include it incase
    // I need it
    // having two the same method name is called method overload
    public Vehicle(){
        System.out.println(" A vehicle has at lest one wheel ");
    }
// creating this constractor class will alow me override the defauld constractor.
    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String accelerate() {
        return "A vehicle accelerates";
    }
    public String stops () {
        return "A vehicle stops";
    }

    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return make;
    }
    public void SetYear (int year){
        this.year = year;
    }
}
