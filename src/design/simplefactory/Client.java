package design.simplefactory;
/**
 * 客户端测试类
 * @author msi
 * @date 2019年5月26日
 */
public class Client {
	public static void main(String[] args) {
		Chart chart;
		// 通过静态工厂方法创建产品
		chart = ChartFactory.getChart(XMLUtil.getChartType());
		chart.display();
	}
}
