package org.example;

public class Main {
	public static void main(String[] args) {
		StudentBuilder studentBuilder = new StudentConcreteBuilder()
			.setFirstName("Tran")
			.setLastName("Quang Huy");

		System.out.println(studentBuilder.build());
	}
}