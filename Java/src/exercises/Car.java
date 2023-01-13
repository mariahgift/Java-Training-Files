package exercises;

public class Car {
    private int speed = 0;
    private int batteryDrain = 0;
    private int distanceDrive = 0;
    private int battery = 100;

    //Constructor for speed and batteryDrain
    public Car(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public Car(int speed) {
        this.speed = speed;
    }

    //Getter and Setter for speed and batteryDrain
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public void setBatteryDrain(int batteryDrain) {
        this.batteryDrain = batteryDrain;
    }


    public void drive() {
        int carDistance = speed * (battery / batteryDrain);
        System.out.println(carDistance);
    }

    public boolean isBatteryDrained() {
        if (battery > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
