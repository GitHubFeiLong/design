package design.singleton;
/**
 * 通过静态内部类实现单例模式：
 * 结合饿汉式单例、懒汉式单例的优点，既不影响性能，又能延迟加载，又可保证线程安全
 * @author msi
 * @date 2019年5月29日
 */
public class Singleton {
	private Singleton() {
		
	}
	// 静态内部类
	private static class HolderClass {
		private final static Singleton instance = new Singleton();
	}	

	public static Singleton getInstance() {
		return HolderClass.instance;
	}
	
	public static void main(String[] args) {
		Singleton s1, s2;
		s1 = Singleton.getInstance();
		s2 = Singleton.getInstance();
		System.out.println(s1 ==s2);
	}

}
