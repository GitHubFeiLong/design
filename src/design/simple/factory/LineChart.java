package design.simple.factory;
/**
 * 折线图类，充当具体产品类
 * @author msi
 * @date 2019年5月26日
 */
public class LineChart implements Chart{

	public LineChart() {
		System.out.println("创建折线图");
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示折线图");
	}

}
