package design.strategy;

/**
 * 儿童票折扣类，充当具体策略类
 * @ClassName ChildrenDiscount
 * @Description TODO
 * @Author msi
 * @Date 2019/6/26 18:57
 */
public class ChildrenDiscount implements Discount {
	private final double DISCOUNT = 10;
	@Override
	public double calculate(double price) {
		System.out.println("儿童票：");
		if(price >= 20){
			return price - DISCOUNT;
		}
		return price ;
	}
}
