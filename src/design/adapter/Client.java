package design.adapter;
/**
 * 适配器模式
 * @author msi
 * @date 2019年6月19日
 */
public class Client {
	public static void main(String [] args) {
		CarController car = new PoliceCarAdapter(); 
		car.move();
		car.phonate();
		car.twinkle();
	}

}
