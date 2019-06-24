package design.observer;

import java.util.ArrayList;

/**
 * 指挥部类，充当抽象目标类
 * @ClassName AllyControlCenter
 * @Description TODO
 * @Author msi
 * @Date 2019/6/24 19:54
 */
public abstract class AllyControlCenter {
	protected String allyName;  // 战队名称
	// 定义一个集合用于存储战队成员
	protected ArrayList<Observer> players = new ArrayList<Observer>();

	public String getAllyName() {
		return allyName;
	}

	public void setAllyName(String allyName) {
		this.allyName = allyName;
	}

	/**
	 * 注册
	 * @param obs
	 */
	public void join(Observer obs){
		System.out.println(obs.getName() + "加入" + this.allyName + "战队！");
		players.add(obs);
	}

	/**
	 * 注销
	 * @param observer
	 */
	public void quit(Observer observer){
		players.remove(observer);
	}

	/**
	 * 申明抽象通知方法
	 * @param name
	 */
	public abstract void notifyObserver(String name);

}
