package design.decorator;
/**
 * 构件装饰类：充当抽象装饰类
 * @author msi
 * @date 2019年6月10日
 */
public class ComponentDecorator extends Component{
	// 维持对抽象构件类的引用
	private Component component;
	// 注入抽象构件类型对象
	public ComponentDecorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void display() {
		component.display();
	}
	

}
