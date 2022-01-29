// package com.company;

public class MountainBike extends Bycycle{
    // MountainBike subclass has one field

    public int seatHeight ;
    // MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight ,int startCandence,int startSpeed ,int startGear)
    {
        super(startCandence,startSpeed,startGear);
        seatHeight=startHeight;

    }
    // the MountainBike subclass has
    // one method
    public void setSeatHeight(int newValue)
    {
        seatHeight= newValue;
    }
}
