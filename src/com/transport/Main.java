package com.transport;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.move();
        bus.stop();

        Tank tank = new Tank();
        tank.shoot();
        tank.camouflage();

        Locomotive locomotive = new Locomotive();
        locomotive.whistle();
        locomotive.generateSteam();
    }
}
