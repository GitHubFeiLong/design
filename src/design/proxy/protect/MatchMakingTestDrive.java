package design.proxy.protect;


import java.lang.reflect.*;
import java.util.*;
/**
 * @ClassName MatchMakingTestDrive
 * @Description TODO 步骤三：测试配对服务系统。利用适当的代理包装任何PersonBean对象。
 * @Author msi
 * @Date 2019/6/16 9:55
 */
public class MatchMakingTestDrive {
	// 实例变量, 当作是保存顾客的“数据库”
	Hashtable datingDB = new Hashtable();

	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}

	public MatchMakingTestDrive() {
		// 在构造器中初始化数据库
		initializeDatabase();
	}

	public void drive() {
		PersonBean joe = getPersonFromDatabase("Joe Javabean");  //从数据库中取出一个人
		PersonBean ownerProxy = getOwnerProxy(joe); // 创建这个人的拥有者代理
		System.out.println("Name is " + ownerProxy.getName()); //  输出这个人的名字
		ownerProxy.setInterests("bowling, Go");  // 使用拥有者代理来设置自己的兴趣
		System.out.println("Interests set from owner proxy");
		try {
			// 尝试用拥有者代理来给自己评分
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			// 如果给自己评分会出错
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

		// 创建一个非拥有者的代理
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try {
			// 尝试用非拥有者代理来设置兴趣
			nonOwnerProxy.setInterests("bowling, Go");
		} catch (Exception e) {
			// 不可以给别人设置兴趣
			System.out.println("Can't set interests from non owner proxy");
		}
		// 可以给别人评分
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
	}

	// 此方法需要一个person对象作为参数，然后返回该对象的代理
	// 因为代理和主题有相同的接口，所以我们返回接口PersonBean
	PersonBean getOwnerProxy(PersonBean person) {
		// 此代码创建了代理（代码有点丑）
		// 我们利用Proxy类的静态newProxyInstance方法创建代理对象(Java反射机制)
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(),  // 将personBean的类载入器当作参数
				person.getClass().getInterfaces(),   // 代理需要实现的接口
				new OwnerInvocationHandler(person)); // 调用非拥有者的处理器
	}

	PersonBean getNonOwnerProxy(PersonBean person) {

		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
	}

	PersonBean getPersonFromDatabase(String name) {
		return (PersonBean)datingDB.get(name);
	}

	// 初始化“数据库”
	void initializeDatabase() {
		PersonBean joe = new PersonBeanImpl();
		joe.setName("Joe Javabean");
		joe.setInterests("cars, computers, music");
		joe.setHotOrNotRating(7);
		datingDB.put(joe.getName(), joe);

		PersonBean kelly = new PersonBeanImpl();
		kelly.setName("Kelly Klosure");
		kelly.setInterests("ebay, movies, music");
		kelly.setHotOrNotRating(6);
		datingDB.put(kelly.getName(), kelly);
	}
}