package design.singleton;
/**
 * 饿汉式单例：定义静态变量时，就实例化单例类，因此在类加载时
 * 单例对象就已创建
 * @author msi
 * @date 2019年5月29日
 */
public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();
	private EagerSingleton() {
		
	}
	public static EagerSingleton getInstance() {
		return instance;
	}
}
