
public abstract class BikeImpl2 extends BikeImpl1 {

	@Override
	public void seat() {
		System.out.println("seat");
	}

	@Override
	public void breaks() {
		System.out.println("breaks");
	}
	
	public abstract void headlight();

}
