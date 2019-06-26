package design.strategy;

/**
 * 策略模式（Strategy Pattern）：定义一系列算法，将每一个算法封装起来，并让它们可以相互替换。
 * 策略模式让算法可以独立于使用它的客户而变化。策略模式又称为政策模式
 * @ClassName Client
 * @Description TODO
 * @Author msi
 * @Date 2019/6/26 18:44
 */
public class Client {
	public static void main(String[] args) {
		MovieTicket mt = new MovieTicket();
		double originalPrice = 60.0;
		double currentPrice = 0;
		mt.setPrice(originalPrice);
		Discount discount = new ChildrenDiscount();
		mt.setDiscount(discount);
		currentPrice = mt.getPrice();
		System.out.println(currentPrice);

	}
}
