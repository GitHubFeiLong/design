package design.decorator.work1;
/**
 * 牛奶具体装饰类
 * @author msi
 * @date 2019年6月10日
 */
public class MilkDecorator extends ComponentDecorator{

	public MilkDecorator(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.setDescription() + super.getDescription();
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.setCost() + super.getCost();
	}

	public String setDescription() {
		return "牛奶";
	}

	public int setCost() {
		return 6;
	}

}
