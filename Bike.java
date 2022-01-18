package testing;

public class Bike {
	String manufacturer;
	int model;
	int no_of_gears;
	boolean four_stroke;
	double mileage;
	String color;
	public void start() {
		System.out.println("Insert key!");
		System.out.println("Press self start");
		System.out.println("Accel");
	}
	public void accel() {
		System.out.println("Consume");
	}
	public void gearup() {
		System.out.println("Increase the speed");
	}
	public void breakdown() {
		System.out.println("decrease the speed");
	}
	public void brake() {
		System.out.println("Stop");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
