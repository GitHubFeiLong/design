package design.decorator.work;

public class SoundDecorator extends ComponentDecorator {

	public SoundDecorator(Component component) {

		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void CID() {
		// TODO Auto-generated method stub
		// 装饰方法
		this.setmakeASound();
		// 具体构建类方法
		super.CID();
	}

	public void setmakeASound() {
		System.out.println("发出声音！");
	}
}
