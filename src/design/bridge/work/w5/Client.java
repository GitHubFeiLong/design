package design.bridge.work.w5;

public class Client {
	public static void main(String [] args) {
		Aircraft a = new Passenger();
		Manufacturer imp = new BoeingImp();
		a.setImp(imp);
		a.doSomething();
	}

}
