package design.strategy;

/**
 * @ClassName VIPDiscount
 * @Description TODO
 * @Author msi
 * @Date 2019/6/26 18:59
 */
public class VIPDiscount implements Discount {
	private final double DISCOUNT = 0.5;
	@Override
	public double calculate(double price) {
		System.out.println("VIP票：");
		System.out.println("增加积分！");
		return price * DISCOUNT;
	}
}
