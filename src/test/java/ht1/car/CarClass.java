package ht1.car;

public class CarClass implements Drivable {

    public String carName;
    public String carModel;
    public int carYear;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }


    @Override
    public void start() {
        System.out.println("Car " + getCarName() + " " + getCarModel() + " " + getCarYear() + " started.");
    }

    @Override
    public void stop() {
        System.out.println("Car " + getCarName() + " " + getCarModel() + " " + getCarYear() + " stopped.");
    }

    @Override
    public <T> void drive(int distance) {
        System.out.println("Distance: " + getCarName() + " " + getCarModel() + " " + getCarYear() + " drove " + distance + " kilometers.");
    }
}
