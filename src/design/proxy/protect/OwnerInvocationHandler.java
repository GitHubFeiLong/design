package design.proxy.protect;

// InvocationHandler在java.lan.reflect包中
import java.lang.reflect.*;


/**
 * @ClassName OwnerInvocationHandler
 * @Description TODO // 拥有者的InvocationHandler
 * @Author msi
 * @Date 2019/6/16 9:48
 */
public class OwnerInvocationHandler implements InvocationHandler {
	PersonBean person;

	// 将person传入构造器，并保持引用
	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	// 每次代理的方法被调用，就会导致代理调用此invoke方法
	public Object invoke(Object proxy, Method method, Object[] args)
			throws IllegalAccessException {

		try {
			if (method.getName().startsWith("get")) {
				// 如果方法是一个getter，就允许调用
				return method.invoke(person, args);

			} else if (method.getName().equals("setHotOrNotRating")) {
				// 否则，如果方法是HotOrNotRating(), 因为不能给自己打分，所以就抛出异常，表示不允许
				System.out.println("不能给自己评分");
				throw new IllegalAccessException();

			} else if (method.getName().startsWith("set")) {
				// 如果是setter，可以设置自己的信息，所以就给调用
				return method.invoke(person, args);

			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null; //其他方法都是未定义的，返回null
	}
}
