package com.ust.training.bsics;

public class Bus implements Vehicle {

    private String capacity;
    private String route;

    public void applyBrake() {
        System.out.println("Bus | brake applied");
    }

    public void acceleration() {
        System.out.println("Bus | accelerated");
    }

    public void applySpeedBrake(){
        System.out.println("Bus | Speed brake applied");
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
