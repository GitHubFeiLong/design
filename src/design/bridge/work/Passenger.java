package design.bridge.work;

public class Passenger extends Aircraft{

	@Override
	public void doSomething() {
		imp.sayHi();
		System.out.println("承载旅客");
		
	}

}
