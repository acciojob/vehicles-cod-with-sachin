package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

//    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
//        super();
//        //Hint: Car extends Vehicle
//    }


    public Car(String name, int wheels, String type, int doors, int gears, boolean isManual, int currentGear, int seats) {
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = currentGear;
        this.seats = seats;
    }

    public Car(String name,boolean isManual)
    {
        super(name);
        this.isManual=isManual;
    }
    public void changeGear(int newGear){
         setCurrentGear(newGear);
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
     setCurrentSpeed(newSpeed);
     setCurrentDirection(newDirection);

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
