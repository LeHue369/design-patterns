package org.example.usinginterface;


public class VehicleFactory {
	public Vehicle createVehicle(String type) {
		switch (type) {
			case "car":
				return new Car();
			case "truck":
				return new Truck();
			case "motorcycle":
				return new Motorcycle();
			default:
				throw new IllegalArgumentException("Invalid vehicle type: " + type);
		}
	}
}
