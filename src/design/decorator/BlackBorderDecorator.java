package design.decorator;

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
