package design.adapter.work;

public class Adapter implements Cat, Dog{
	
	private Cat cat;
	private Dog dog;
	
	
	public Adapter(Dog dog, Cat cat) {
		super();
		this.dog = dog;
		this.cat = cat;
	}

	@Override
	public void cre() {
		System.out.println("学狗叫");
		dog.cre();
		
	}

	@Override
	public void grabMouse() {
		System.out.println("学猫抓老鼠");
		cat.grabMouse();
	}

}
