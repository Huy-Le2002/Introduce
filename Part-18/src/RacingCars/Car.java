package RacingCars;

import DemoJoin.Main;

import java.util.Random;

public class Car implements Runnable{
    public String name;

    public Car(String name) {
        this.name = name;
    }
    public static int DISTANCE = 100;
    public static int STEP = 5;
    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < Main.DISTANCE) {
            int speed = (new Random().nextInt(20));
            runDistance += speed;
            String log = "|";
        }
    }

}
