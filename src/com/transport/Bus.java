package com.transport;

public class Bus implements PublicTransport{
    @Override
    public void move(){
        System.out.println("Автобус едет");
    }
    @Override
    public void stop(){
        System.out.println("Автобус остановился");
    }
}
