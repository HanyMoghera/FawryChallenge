public interface Engine {
    void increase();

    void decrease();

    void syncWithCarSpeed(int carSpeed);

    int getSpeed();

    String getType();
}
