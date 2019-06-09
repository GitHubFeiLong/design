package design.composite.work;
/**
 * 安全组合模式
 * @author msi
 * @date 2019年6月9日
 */
public class Client {
	public static void main(String[] args) {
		// 抽象构建类
		AbstractComponent ac1, ac2, ac3, ac4, ac5, ac6, ac7, ac8;
		// 容器构建类
		Composite acs1, acs2, acs3, acs4;
		ac1 = new LeafComponent("教务办公室");
		ac2 = new LeafComponent("行政办公室");
		
		ac3 = new LeafComponent("教务办公室");
		ac4 = new LeafComponent("行政办公室");
		
		ac5 = new LeafComponent("教务办公室");
		ac6 = new LeafComponent("行政办公室");
		
		ac7 = new LeafComponent("教务办公室");
		ac8 = new LeafComponent("行政办公室");
		
		acs1 = new Composite("北京总部");
		acs2 = new Composite("湖南分校");
		acs3 = new Composite("长沙教学点");
		acs4 = new Composite("湘潭教学点");
		
		acs1.add(ac1);
		acs1.add(acs2);
		acs1.add(ac2);
		
		acs2.add(ac3);
		acs2.add(ac4);
		acs2.add(acs3);
		acs2.add(acs4);
		
		acs3.add(ac5);
		acs3.add(ac6);
		
		acs4.add(ac7);
		acs4.add(ac8);
		
		// 模拟给北京总部发送公文
		acs1.sendFile();
	}
}
