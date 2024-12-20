package com.transport;

public class Steamsheep implements SteamTransport{
    @Override
    public void whistle(){
        System.out.println("Пароход гудит");
    }
    @Override
    public void generateSteam(){
        System.out.println("Пароход выпускает пар из трубы");
    }
}
