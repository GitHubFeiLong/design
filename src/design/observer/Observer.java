package design.observer;

/**
 * 抽象观察者类
 * @ClassName Observer
 * @Description TODO
 * @Author msi
 * @Date 2019/6/24 20:06
 */
public interface Observer {
	String getName();
	void setName(String name);
	void help();    // 声明支援盟友的方法
	void beAttacked(AllyControlCenter acc);     // 申明遭受攻击的方法
}
