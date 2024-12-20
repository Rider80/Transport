package com.transport;

public class FighterJet implements MilitaryVehicle{
    @Override
    public void shoot(){
        System.out.println("Истребитель стреляет");
    }
    @Override
    public void camouflage(){
        System.out.println("Истребитель маскируется");
    }
}
