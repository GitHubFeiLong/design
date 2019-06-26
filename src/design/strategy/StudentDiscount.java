package design.strategy;

/**
 * @ClassName StudentDiscount
 * @Description TODO
 * @Author msi
 * @Date 2019/6/26 18:55
 */
public class StudentDiscount implements Discount {
	private final double DISCOUNT = 0.8;
	@Override
	public double calculate(double price) {
		System.out.println("学生票：");
		return price * DISCOUNT;
	}
}
