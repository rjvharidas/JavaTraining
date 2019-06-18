package com.ust.training.bsics;

public class Car implements Vehicle {

    private String color;
    private String number;

    public void applyBrake() {
        System.out.println("Car | brake applied");
    }

    public void applyBrake(String msg) {
        System.out.println("Car |"+msg+" brake applied");
    }

    public void acceleration() {
        System.out.println("Car | accelerated");
    }

    public void abs(){
        System.out.println("Car | abs worked");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
