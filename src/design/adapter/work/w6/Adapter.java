package design.adapter.work.w6;

public class Adapter{
	
	private Cat cat;
	private Dog dog;
	
	
	public Adapter(Dog dog, Cat cat) {
		super();
		this.dog = dog;
		this.cat = cat;
	}

	public void cre() {
		System.out.print("小猫学狗叫：");
		dog.cre();
		
	}

	public void grabMouse() {
		System.out.print("小狗学猫抓老鼠：");
		cat.grabMouse();
	}

}
