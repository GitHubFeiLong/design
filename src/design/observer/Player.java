package design.observer;

/**
 * @ClassName Player
 * @Description TODO
 * @Author msi
 * @Date 2019/6/24 20:08
 */
public class Player implements Observer {
	private String name;

	public Player(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 支援方法
	 */
	@Override
	public void help() {
		System.out.println("坚持住！" + this.name + "马上来救你！");
	}

	/**
	 * 遭受攻击方法实现，当遭受攻击时将调用战队控制中心类的通知方法 notifyObserver()
	 * 来通知盟友
	 * @param acc
	 */
	@Override
	public void beAttacked(AllyControlCenter acc) {
		System.out.println(this.name + "被攻击");
		acc.notifyObserver(name);
	}
}
