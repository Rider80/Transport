package com.transport;

public class Trolleybus implements PublicTransport{
    @Override
    public void move(){
        System.out.println("Троллейбус едет");
    }
    @Override
    public void stop(){
        System.out.println("Троллейбус остановился");
    }
}
