package design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @ClassName DAOLogHandler
 * @Description TODO 自定义请求处理程序类
 * @Author msi
 * @Date 2019/6/15 11:19
 */
public class DAOLogHandler implements InvocationHandler {
	private Calendar calendar;
	private Object object;

	public DAOLogHandler() {
	}

	// 自定义有参构造方法，用于注入一个需要提供代理真实主题对象。
	public DAOLogHandler(Object object) {
		this.object = object;
	}

	// 实现 invoker() 方法，调用真实主题类中定义的方法。
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		beforeInvoke();
		// 转发调用真实主题方法
		Object result = method.invoke(object, args);
		afterInvoke();
		return result;
	}

	// 记录方法调用时间
	private void beforeInvoke() {
		calendar = new GregorianCalendar();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		String time = hour + ":" + minute + ":" + second;
		System.out.println("调用时间：" + time);
	}

	// 记录方法之后调用
	private void afterInvoke() {
		System.out.println("方法调用结束");
	}

}
