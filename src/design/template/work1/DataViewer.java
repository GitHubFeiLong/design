package design.template.work1;

/**
 * @ClassName DataViewer
 * @Description TODO
 * @Author msi
 * @Date 2019/6/27 19:39
 */
public abstract class DataViewer {
	// 抽象方法获取数据
	public abstract void getData();

	// 具体方法：转换数据
	public void converData(){
		System.out.println("将数据转换为XML格式。");
	}
	// 抽象方法：显示数据
	public abstract void displayData();

	// 钩子方法：判断是否为XML格式的数据
	public boolean isNotXMLData(){
		return true;
	}

	// 模板方法

	public void process(){
		getData();
		// 如果不是MXL格式的数据，进行数据转换
		if(isNotXMLData()){
			converData();
		}
		displayData();
	}
}
