package design.decorator.work1;
/**
 * 重烘培咖啡：充当具体构件类
 * @author msi
 * @date 2019年6月10日
 */
public class DarkBeverage extends Beverage{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "重烘培咖啡";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 20;
	}

}
