package design.adapter.work.w6;

public class Client {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Adapter a = new Adapter(dog, cat);
		a.grabMouse();
		a.cre();
	}

}
