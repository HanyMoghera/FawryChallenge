public class Main {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        System.out.println("Gasoline Car ");
        testCar(factory.createCar("gasoline"));

        System.out.println("\nElectronic Car ");
        testCar(factory.createCar("electronic"));

        System.out.println("\nMixed Hybrid Car ");
        testHybrid(factory.createCar("hybrid"));

        System.out.println("\nEngine Replacement Demo ");
        Car replaceableCar = factory.createCar("gasoline");
        replaceableCar.start();
        replaceableCar.accelerate();
        factory.replaceCarEngine(replaceableCar, "hybrid");
        replaceableCar.accelerate();
        replaceableCar.stop();
    }

    private static void testCar(Car car) {
        car.start();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.stop();
    }

    private static void testHybrid(Car car) {
        car.start();
        car.accelerate(); // 20: electronic
        car.accelerate(); // 40: electronic
        car.accelerate(); // 60: gasoline
        car.accelerate(); // 80: gasoline
        car.brake();      // 60: gasoline
        car.brake();      // 40: electronic
        car.stop();
    }
}
