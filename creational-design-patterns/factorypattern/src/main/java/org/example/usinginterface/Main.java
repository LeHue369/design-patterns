package org.example.usinginterface;

public class Main {
	public static void main(String[] args) {
		VehicleFactory vehicleFactory = new VehicleFactory();

		Vehicle car = vehicleFactory.createVehicle("car");
		car.drive();

		Vehicle truck = vehicleFactory.createVehicle("truck");
		truck.drive();

		Vehicle motorcycle = vehicleFactory.createVehicle("motorcycle");
		motorcycle.drive();
	}
}