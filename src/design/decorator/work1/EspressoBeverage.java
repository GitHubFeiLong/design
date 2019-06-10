package design.decorator.work1;
/**
 * 浓缩咖啡：充当具体构件类
 * @author msi
 * @date 2019年6月10日
 */
public class EspressoBeverage extends Beverage{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "浓缩咖啡";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 25;
	}

}
