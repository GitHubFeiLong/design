package design.adapter.work;

public class Client {
	public static void main(String[] args) {
		Dog dog = new DogImpl();
		Cat cat = new CatImpl();
		Adapter a = new Adapter(dog, cat);
		a.grabMouse();
		a.cre();
	}

}
