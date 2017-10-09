package ru.itpark;

public class SportCar extends Car {

    private double n2oConsumption;
    private double n2oAmount;

    public SportCar(String model, double fuelConsumption, double n2oConsumption) {
        // вызов конструктора класса-предка
        super(model, fuelConsumption);
        if (n2oConsumption > 0) {
            this.n2oConsumption = n2oConsumption;
        } else {
            this.n2oConsumption = 1;
        }
    }

    public double getN2oConsumption() {
        return n2oConsumption;
    }

    public double getN2oAmount() {
        return n2oAmount;
    }

    public void setN2oAmount(double n2oAmount) {
        this.n2oAmount = n2oAmount;
    }

    public void go(int kilometers) {
        if (kilometers >= 0) {
            this.mileage = this.mileage + kilometers;
            this.fuelAmount = this.fuelAmount - (fuelConsumption * kilometers) / 100;
            this.n2oAmount = this.n2oAmount - (n2oConsumption * kilometers) / 100;
        } else {
            System.err.println("Скрутить решил????");
        }
    }
}
