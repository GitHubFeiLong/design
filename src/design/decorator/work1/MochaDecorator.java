package design.decorator.work1;
/**
 * 摩卡具体装饰类
 * @author msi
 * @date 2019年6月10日
 */
public class MochaDecorator extends ComponentDecorator{

	public MochaDecorator(Beverage beverage) {
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
		return "摩卡";
	}

	public int setCost() {
		return 10;
	}
}
