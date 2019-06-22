package design.decorator;

/**
 * 黑色边框装饰类，充当具体装饰类
 */
public class BlackBorderDecorator extends ComponentDecorator{

	public BlackBorderDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		this.setBlackBorder();
		super.display();
	}

	public void setBlackBorder() {
		System.out.println("为构件添加黑色边框！");
	}
	
}
