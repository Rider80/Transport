package com.transport;

public class Tank implements MilitaryVehicle{
    @Override
    public void shoot(){
        System.out.println("Танк стреляет");
    }
    @Override
    public void camouflage(){
        System.out.println("Танк маскируется");
    }
}
