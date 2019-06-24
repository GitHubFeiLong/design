package design.observer;

/**
 * @ClassName ConcreteAllyControlCenter
 * @Description TODO
 * @Author msi
 * @Date 2019/6/24 20:01
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

	public ConcreteAllyControlCenter(String allyName) {
		System.out.println(allyName + "战队创建成功！");
		System.out.println("------------------------");
		this.allyName = allyName;
	}

	/**
	 * 实现通知方法
	 * @param name
	 */
	@Override
	public void notifyObserver(String name) {
		System.out.println(this.allyName + "战队紧急通知，盟友：" + name + "遭受敌人攻击！");
		// 循环遍历观察者集合，调用每一个盟友（除了自己）的支援方法
		for(Observer obs : players){
			if(!obs.getName().equalsIgnoreCase(name)){
				obs.help();
			}
		}
	}
}
