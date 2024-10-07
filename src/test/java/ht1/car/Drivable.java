package ht1.car;

public interface Drivable {
    public void start();
    public void stop();
    public <T> void drive(int distance);
}
