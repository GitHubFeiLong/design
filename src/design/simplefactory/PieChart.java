package design.simplefactory;
/**
 * 饼状图类，充当具体产品类
 * @author msi
 * @date 2019年5月26日
 */
public class PieChart implements Chart{

	public PieChart() {
		System.out.println("创建饼状图类");
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示饼状图类");
	}

}
