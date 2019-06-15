package design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author msi
 * @Date 2019/6/15 11:28
 */
public class Client {
	public static void main(String[] args) {
		InvocationHandler handler = null;
		AbstractUserDAO userDao = new UserDAO();
		handler = new DAOLogHandler(userDao);
		AbstractUserDAO proxy = null;
		// 动态代理创建对象，用于代理一个 AbstractUserDAO 类型的真实主题对象
		proxy = (AbstractUserDAO) Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(), new Class[]{AbstractUserDAO.class}, handler);
		// 调用业务方法
		proxy.findUserById("张无忌");

		System.out.println("-------------------------------------");

		AbstractDocumentDAO docDAO = new DocumentDAO();
		handler = new DAOLogHandler(docDAO);
		AbstractDocumentDAO proxy_new = null;
		// 动态代理创建对象，用于代理一个 AbstractDocumentDAO 类型的真实主题对象
		proxy_new = (AbstractDocumentDAO) Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(), new Class[]{AbstractDocumentDAO.class}, handler);
		// 调用业务方法
		proxy_new.deleteDocumentById("D002");




		AbstractDocumentDAO documentDao = new DocumentDAO();

	}
}
