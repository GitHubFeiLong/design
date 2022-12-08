package design.template.method.work1;

/**
 * @ClassName XMLDataViewer
 * @Description TODO
 * @Author msi
 * @Date 2019/6/27 19:44
 */
public class XMLDataViewer extends DataViewer {
	// 实现父类方法：获取数据
	@Override
	public void getData() {
		System.out.println("从XML文件中获取数据");
	}
	// 实现父类方法：显示数据
	@Override
	public void displayData() {
		System.out.println("以柱状图显示数据");
	}

	// 覆盖父类的 钩子方法
	@Override
	public boolean isNotXMLData() {
		return true;
	}
}
