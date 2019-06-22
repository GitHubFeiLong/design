package design.mediator;

/**
 * 文本框充当具体同事类
 * @ClassName TextBox
 * @Description TODO
 * @Author msi
 * @Date 2019/6/22 9:18
 */
public class TextBox extends Component {
	@Override
	public void update() {
		System.out.println("客户信息增加成功后文本框清空");
	}
	public void setText(){
		System.out.println("文本框显示：小龙女");
	}
}
