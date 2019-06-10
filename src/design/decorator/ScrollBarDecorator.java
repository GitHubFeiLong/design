package design.decorator;
/**
 * 滚动条装饰类，充当具体装饰类
 * @author msi
 * @date 2019年6月10日
 */
public class ScrollBarDecorator extends ComponentDecorator{

	public ScrollBarDecorator(Component component) {
		super(component);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		this.setScrollBar();
		super.display();
	}

	public void setScrollBar() {
		System.out.println("为构件增加滚动条！");
	}
}
