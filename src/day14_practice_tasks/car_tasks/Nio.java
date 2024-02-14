package day14_practice_tasks.car_tasks;

public class Nio extends Car implements AutoPilot{

    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " parked itself");
    }

    @Override
    public void selfDrive() {

        System.out.println(getMake() + " " + getModel() + " drives by itself");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " started and is ready to go");

    }

    @Override
    public void drive() {

        System.out.println(getMake() + " " + getModel() + " is driving.");
    }
}
