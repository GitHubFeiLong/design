package design.decorator;
/**
 * 窗体类：充当具体构件类
 * @author msi
 * @date 2019年6月10日
 */
public class Window extends Component{

	@Override
	public void display() {
		System.out.println("显示窗体！");
		
	}

}
