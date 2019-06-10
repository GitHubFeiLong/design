package design.decorator.work1;
/**
 * 奶泡具体装饰类：充当具体装饰类
 * @author msi
 * @date 2019年6月10日
 */
public class WhipDecorator extends ComponentDecorator{

	public WhipDecorator(Beverage beverage) {
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
		return "奶泡";
	}

	public int setCost() {
		return 8;
	}

}
