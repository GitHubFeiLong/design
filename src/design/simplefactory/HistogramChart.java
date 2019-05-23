package design.simplefactory;
/**
 * 柱状图类，充当具体产品类
 * @author msi
 * @date 2019年5月26日
 */
public class HistogramChart implements Chart{

	public HistogramChart() {
		System.out.println("创建柱状图");
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示柱状图");
	}

}
