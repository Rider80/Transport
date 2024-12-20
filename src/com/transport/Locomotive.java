package com.transport;

public class Locomotive implements SteamTransport{
    @Override
    public void whistle(){
        System.out.println("Паровоз гудит");
    }
    @Override
    public void generateSteam(){
        System.out.println("Паровоз выпускает пар из трубы");
    }
}
