package design.decorator.work1;

public class ComponentDecorator extends Beverage{

	private Beverage beverage;
	
	
	public ComponentDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription();
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost();
	}

}
