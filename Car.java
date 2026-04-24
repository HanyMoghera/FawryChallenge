public class Car {
    private static final int MAX_SPEED = 200;
    private static final int STEP = 20;

    private Engine engine;
    private int speed = 0;
    private boolean started = false;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        started = true;
        speed = 0;
        engine.syncWithCarSpeed(speed);
        printStatus("Car started");
    }

    public void stop() {
        if (!started) {
            printStatus("Car is already stopped");
            return;
        }
        while (speed > 0) {
            brake();
        }
        started = false;
        printStatus("Car stopped");
    }

    public void accelerate() {
        if (!started) {
            printStatus("Cannot accelerate. Start the car first");
            return;
        }
        speed = Math.min(speed + STEP, MAX_SPEED);
        engine.syncWithCarSpeed(speed);
        printStatus("Accelerated");
    }

    public void brake() {
        if (!started) {
            printStatus("Cannot brake. Start the car first");
            return;
        }
        speed = Math.max(speed - STEP, 0);
        engine.syncWithCarSpeed(speed);
        printStatus("Braked");
    }

    public void replaceEngine(Engine newEngine) {
        engine = newEngine;
        engine.syncWithCarSpeed(speed);
        printStatus("Engine replaced");
    }

    private void printStatus(String action) {
        System.out.println(
            action + " | Car Speed: " + speed + " km/h | Engine: " + engine.getType() + " | Engine Speed: " + engine.getSpeed() + " km/h"
        );
    }
}
