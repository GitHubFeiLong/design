package design.adapter;

public class Client {
	public static void main(String [] args) {
		CarController car = new PoliceCarAdapter(); 
		car.move();
		car.phonate();
		car.twinkle();
	}

}
