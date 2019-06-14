package design.flyweight.work;

import java.util.Hashtable;

/**
 * @ClassName TextFlyweightFactory
 * @Description TODO 文字抽象享元工厂
 * @Author msi
 * @Date 2019/6/14 20:03
 */
public class TextFlyweightFactory {
	private static TextFlyweightFactory instance = new TextFlyweightFactory();
	private static Hashtable ht;

	private TextFlyweightFactory() {
		ht = new Hashtable();
		FlyweightAbstract fa = new JavaFlyweight();
		ht.put("java", fa);
	}

	public static TextFlyweightFactory getInstance(){
		return instance;
	}

	public static FlyweightAbstract getFB(String text){
		return (FlyweightAbstract) ht.get(text);
	}


}
