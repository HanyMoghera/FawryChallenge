public class CarFactory {
    public Car createCar(String engineType) {
        return new Car(createEngine(engineType));
    }

    public void replaceCarEngine(Car car, String engineType) {
        car.replaceEngine(createEngine(engineType));
    }

    private Engine createEngine(String engineType) {
        String type = engineType.toLowerCase();
        if (type.equals("gasoline") || type.equals("gas")) {
            return new GasolineEngine();
        }
        if (type.equals("electronic") || type.equals("electric")) {
            return new ElectronicEngine();
        }
        if (type.equals("hybrid") || type.equals("mixed_hybrid")) {
            return new MixedHybridEngine();
        }
        throw new IllegalArgumentException("Unknown engine type: " + engineType);
    }
}
