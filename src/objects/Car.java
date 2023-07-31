package objects;

import components.*;

public class Car {

    public Type getType() {
        return type;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
    public double getHorsepowers(){return this.engine.getHorsepowers();}
    public Fuel getFuel(){return this.engine.getTypeOfFuel();}
    public int getEnginDisplacement(){return this.engine.getEngineDisplacement();}
    public String getNameOfEngine(){return this.engine.getNameOfEngine();}
    public int getNumberOfCylinders(){return this.engine.getNumberOfCylinders();}
    public Transmission getTransmission() {
        return transmission;
    }

    public int getSeats() {
        return seats;
    }

    public double getV_Max() {
        return V_Max;
    }

    public double getFromZeroToHundred() {
        return FromZeroToHundred;
    }

    private final Type type;
    private final Brand brand;
    private final String model;
    private final Engine engine;
    private final Transmission transmission;
    private final int seats;
    private final double V_Max;
    private final double FromZeroToHundred;

    public Car(Type type, Brand brand, String model, Engine engine, Transmission transsmision, int seats, double V_Max, double FromZeroToHundred ){
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.transmission = transsmision;
        this.seats = seats;
        this.V_Max = V_Max;
        this.FromZeroToHundred = FromZeroToHundred;
    }


}
