package InterfaceDemo;

interface Drivable {
	void start();
	void stop();
}

class Car implements Drivable {
	private String brand;

	Car(String brand) {
		this.brand = brand;
	}

	@Override
	public void start() {
		System.out.println(brand + " car is starting...");
	}

	@Override
	public void stop() {
		System.out.println(brand + " car has stopped.");
	}
}

class Bike implements Drivable {
	private String brand;

	Bike(String brand) {
		this.brand = brand;
	}

	@Override
	public void start() {
		System.out.println(brand + " bike is starting...");
	}

	@Override
	public void stop() {
		System.out.println(brand + " bike has stopped.");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Drivable car = new Car("Toyota");
		Drivable bike = new Bike("Yamaha");

		car.start();
		car.stop();

		bike.start();
		bike.stop();
	}
}