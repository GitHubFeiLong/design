package design.decorator;
/**
 *文本框类：充当具体构件类
 * @author msi
 * @date 2019年6月10日
 */
public class TextBox extends Component{

	@Override
	public void display() {
		System.out.println("显示文本框！");
		
	}

}
