// package com.company;

public class Bycycle {
    // the bicycle class has
    // three field
    public int cadence;
    public int gear;
    public int speed;
    //the Bicycle class has
    // one constructor
    public Bycycle(int startCadence,int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;



    }
    // Bicycle class has
    // four methods
    public void setCadence(int newValue)
    {
        cadence = newValue;


    }
    public void setGear(int newValue )
    {
        gear=newValue;
    }
    public void appyBrake(int decrement)
    {
        speed -= decrement;

    }
    public void speedUp (int increment )
    {
        speed+=increment;

    }

}

