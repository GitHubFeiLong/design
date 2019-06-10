package design.decorator.work;

public class JarDecorator extends ComponentDecorator{

	public JarDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void CID() {
		// TODO Auto-generated method stub
		this.setJar();
		super.CID();
	}
	
	public void setJar() {
		System.out.println("发出震动！");
	}

}
