package design.composite.work;

public class LeafComponent extends AbstractComponent{

	private String name;
	public LeafComponent(String name) {
		this.name = name;
	}
	
	@Override
	public void sendFile() {
		// TODO Auto-generated method stub
		System.out.println("给'" + name + "'发送公文");
	}

}
