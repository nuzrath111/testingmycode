package testing;

public class bikeEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bike yamaha= new Bike();
	yamaha.color="Yellow";
	System.out.println("Bike color:"+yamaha.color);
	yamaha.four_stroke=true;
	System.out.println("Is it four_stroke:"+yamaha.four_stroke);
	yamaha.manufacturer="Yamaha";
	System.out.println("Manufacturer:"+yamaha.manufacturer);
	yamaha.start();
	yamaha.accel();
	yamaha.gearup();
	yamaha.breakdown();
	yamaha.brake();
	}

}