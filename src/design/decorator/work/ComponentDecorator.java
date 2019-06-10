package design.decorator.work;
/**
 * 构件装饰类，充当抽象装饰类
 * @author msi
 * @date 2019年6月10日
 */
public class ComponentDecorator extends Component{
	
	private Component component;
	
	public ComponentDecorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void CID() {
		// TODO Auto-generated method stub
		
		// 调用具体构件方法
		component.CID();
	}
	
}
