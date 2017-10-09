package ru.itpark;

public class Car {
    private String model;

    protected double fuelConsumption;
    protected double fuelAmount;

    protected int mileage;

    public Car(String model, double fuelConsumption) {
        this.model = model;
        if (fuelConsumption > 0) {
            this.fuelConsumption = fuelConsumption;
        } else {
            this.fuelConsumption = 1;
        }
        this.mileage = 0;
    }

    public void setFuelAmount(double fuelAmount) {
        if (fuelAmount >= 0) {
            this.fuelAmount = fuelAmount;
        } else {
            this.fuelConsumption = 0;
        }
    }

    public String getModel() {
        return model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public int getMileage() {
        return mileage;
    }

    public void go(int kilometers) {
        if (kilometers >= 0) {
            this.mileage = this.mileage + kilometers;
            this.fuelAmount = this.fuelAmount - (fuelConsumption * kilometers) / 100;
        } else {
            System.err.println("Скрутить решил????");
        }
    }
}
