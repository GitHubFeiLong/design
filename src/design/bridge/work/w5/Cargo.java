package design.bridge.work.w5;

public class Cargo extends Aircraft{

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		imp.sayHi();
		System.out.println("承载货物");
	}

}
