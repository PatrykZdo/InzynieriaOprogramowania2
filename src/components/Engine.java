package components;

public class Engine {
    public String getNameOfEngine() {
        return nameOfEngine;
    }

    public double getHorsepowers() {
        return horsepowers;
    }

    public Fuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    private final String nameOfEngine;
    private double horsepowers;
    private Fuel typeOfFuel;
    private int engineDisplacement;
    private final int numberOfCylinders;

    public Engine(String name, double horses, Fuel fuelType, int engineDisplacement, int numberOfCylinders){
        this.nameOfEngine = name;
        this.horsepowers = horses;
        this.typeOfFuel = fuelType;
        this.engineDisplacement =engineDisplacement;
        this.numberOfCylinders = numberOfCylinders;
    }

}
