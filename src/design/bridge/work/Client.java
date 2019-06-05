package design.bridge.work;

public class Client {
	public static void main(String [] args) {
		Aircraft a = new Passenger();
		ManufacturerImp imp = new BoeingImp();
		a.setImp(imp);
		a.doSomething();
	}

}
