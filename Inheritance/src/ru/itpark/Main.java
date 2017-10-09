package ru.itpark;

public class Main {

    public static void main(String[] args) {
	    Car camry = new Car("Camry", 13);
	    camry.setFuelAmount(60);
	    camry.go(50);
        System.out.println(camry.getFuelAmount());

        SportCar sportCar = new SportCar("Veyron",
                40, 100);

        sportCar.setFuelAmount(100);
        sportCar.setN2oAmount(20);
        sportCar.go(100);
        System.out.println(sportCar.getFuelAmount());
        System.out.println(sportCar.getN2oAmount());

        Car veyronAsCar = sportCar;
    }
}
