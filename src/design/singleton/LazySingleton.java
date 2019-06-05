package design.singleton;
/**
 * 懒汉式单例（延迟加载）
 * @author msi
 * @date 2019年5月29日
 */
public class LazySingleton {
	// 使用双重检查锁定实现时，变量instance需要volatile修饰，确保多线程能正常处理
	private volatile static LazySingleton instance = null;
	
	// 私有构造方法
	private LazySingleton() {
		
	}
	
	// 使用synchronized关键字对方法加锁，确保任意时刻只有一个线程可执行该方法
	// 1.使用synchronized 对整个方法加锁，效率太低
//	synchronized public static LazySingleton getInstance() {
//		if (instance == null) {
//			instance = new LazySingleton();
//		}
//		
//		return instance;
//	}
	
	// 2.A、B两个线程都判断instance=null，当A线程创建了instance实例，B线程不知道A已经创建了，结果B也创建了一个instance实例。违背了单例模式的设计思想
//	public static LazySingleton getInstance() {
//		if (instance == null) {
//			synchronized(LazySingleton.class) {
//				instance = new LazySingleton();
//			}
//		}
//		
//		return instance;
//	}
	// 3.双重检查锁定实现
	public static LazySingleton getInstance() {
		// 第一重判断
		if (instance == null) {
			// 锁定代码块
			synchronized(LazySingleton.class) {
				// 第二重判断
				if (instance == null) {
					instance = new LazySingleton();// 创建单例对象
				}
			}
		}
		
		return instance;
	}
	
}
