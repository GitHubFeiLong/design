package design.decorator.work1;
/**
 * 测试类
 * @author msi
 * @date 2019年6月10日
 */
public class Client {

	public static void main(String[] args) {
		Beverage b1, b2, b3, b4, b5;
		b1 = new EspressoBeverage();
		b2 = new MochaDecorator(b1);
		b3 = new MilkDecorator(b2);
		
		System.out.println(b3.getDescription());
		System.out.println(b3.getCost());

	}

}
