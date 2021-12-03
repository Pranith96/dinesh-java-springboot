
public class MainMethodExample {

	public static void main(String[] args) {

		BikeImpl bike = new BikeImpl();
		bike.breaks();
		bike.engine();
		bike.headLight();
		bike.petrolTank();
		bike.tire();
		
		BikeImpl2 bike2 = new BikeImpl2();
		bike2.breaks();
		bike2.engine();
		bike2.headLight();
		bike2.petrolTank();
		bike2.tire();
		
		Bike bike1 = new BikeImpl();
		bike1.breaks();
		bike1.engine();
		bike1.headLight();
		bike1.petrolTank();
		bike1.tire();
	}

}
