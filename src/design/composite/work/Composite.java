package design.composite.work;

import java.util.ArrayList;

public class Composite extends AbstractComponent{

	private String name;
	private ArrayList<AbstractComponent> list = new ArrayList<AbstractComponent>();
	
	public Composite(String name) {
		this.name = name;
	}
	
	public void add(AbstractComponent ac) {
		list.add(ac);
	}
	
	public void remove(AbstractComponent ac) {
		list.remove(ac);
	}
	
	public AbstractComponent getChild(int i) {
		return list.get(i);
	}
	@Override
	public void sendFile() {
		// TODO Auto-generated method stub
		System.out.println("********为公司'" + name + "'发送公文");
		for (AbstractComponent ac : list) {
			ac.sendFile();
		}
	}

}
