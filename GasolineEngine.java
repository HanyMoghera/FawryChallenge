public class GasolineEngine implements Engine {
    private int speed = 0;

    public void increase() {
        speed++;
    }

    public void decrease() {
        if (speed > 0) {
            speed--;
        }
    }

    public void syncWithCarSpeed(int carSpeed) {
        while (speed < carSpeed) {
            increase();
        }
        while (speed > carSpeed) {
            decrease();
        }
    }

    public int getSpeed() {
        return speed;
    }

    public String getType() {
        return "GasolineEngine";
    }
}
