package com.company;

public class CarApp {

    public static void main(String[] args) {
	// write your code here
        Vehicle a = new Vehicle();
        Vehicle b = new Vehicle("toyota", 2019);
        a.accelerate();
        print(a.accelerate());
        System.out.println("11111111111111111111111111");

        Car newCare = new Car();
        newCare.setMake("Benz");
        print(newCare.getMake());
        print(newCare.stops());

    }

    // creted a print method to call whenever print is needed
    private static void print(String s) {
        System.out.println(s);
    }
}
