class Car{

	int wheel;
	String color;
	float price;

	void start() {
		System.out.println("Car Started");
	}

	void appliedGear() {
		System.out.println("Applied Gear...");
	}

	void moving() {
		System.out.println("Car is moving...");
	}

	void stop() {
		System.out.println("Car stop...");
	}
}
class App {
	public static void main(String args[]) {
		Car BMW = new Car();
		BMW.start();
		BMW.stop();
	}
}
