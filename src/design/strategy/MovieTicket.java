package design.strategy;

/**
 * 电影票类：充当环境类
 * @ClassName MovieTicket
 * @Description TODO
 * @Author msi
 * @Date 2019/6/26 18:51
 */
public class MovieTicket {
	private double price;
	private Discount discount;  // 维持一个抽象折扣类的引用

	public double getPrice() {
		return discount.calculate(this.price);
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
}
