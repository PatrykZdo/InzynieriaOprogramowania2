package builders;

import components.*;
import objects.Car;




public class CarBuilder implements Builder{
    private Type type;
    private Brand brand;
    private String model;
    private int year;
    private Fuel fuel;
    private Transmission transmission;
    private double hundred;
    private double V_Max;
    private int seats;
    private Engine engine;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void setFuel(Fuel fue) {
        this.fuel = fue;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setFromZeroToHundred(double hundred) {
        this.hundred = hundred;
    }

    @Override
    public void setV_Max(double V_Max) {
        this.V_Max = V_Max;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car getResult(){
            return new Car(type,
                    brand,
                    model,
                    engine,
                    transmission,
                    seats,
                    V_Max,
                    hundred);
    }
}
