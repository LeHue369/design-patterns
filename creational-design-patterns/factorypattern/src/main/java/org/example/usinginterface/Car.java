package org.example.usinginterface;

public class Car implements Vehicle {
	@Override
	public void drive() {
		System.out.println("Driving a car");
	}
}