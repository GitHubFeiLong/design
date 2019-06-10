package design.decorator.work;

public class LightDecorator extends ComponentDecorator{

	public LightDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void CID() {
		// TODO Auto-generated method stub
		this.setLight();
		super.CID();
	}

	public void setLight() {
		System.out.println("发出光");
	}
}
