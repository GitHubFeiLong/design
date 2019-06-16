package design.proxy.protect;


import java.lang.reflect.*;
/**
 * @ClassName NonOwnerInvocationHandler
 * @Description TODO 给非拥有者使用的InvocationHandler:
 * @Author msi
 * @Date 2019/6/16 9:52
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
	PersonBean person;

	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

		try {
			if (method.getName().startsWith("get")) {
				// 可以查看其他人的信息
				return method.invoke(person, args);

			} else if (method.getName().equals("setHotOrNotRating")) {
				// 可以给其他人评分
				return method.invoke(person, args);

			} else if (method.getName().startsWith("set")) {
				// 不可以设置别人的信息,所以返回异常
				throw new IllegalAccessException();
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}