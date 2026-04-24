public class MixedHybridEngine implements Engine {
    private final GasolineEngine gasolineEngine = new GasolineEngine();
    private final ElectronicEngine electronicEngine = new ElectronicEngine();
    private Engine activeEngine = electronicEngine;

    private void chooseActiveEngine(int carSpeed) {
        if (carSpeed < 50) {
            activeEngine = electronicEngine;
            gasolineEngine.syncWithCarSpeed(0);
        } else {
            activeEngine = gasolineEngine;
            electronicEngine.syncWithCarSpeed(0);
        }
    }

    public void increase() {
        activeEngine.increase();
    }

    public void decrease() {
        activeEngine.decrease();
    }

    public void syncWithCarSpeed(int carSpeed) {
        chooseActiveEngine(carSpeed);
        activeEngine.syncWithCarSpeed(carSpeed);
    }

    public int getSpeed() {
        return activeEngine.getSpeed();
    }

    public String getType() {
        return "MixedHybridEngine(active=" + activeEngine.getType() + ")";
    }
}
