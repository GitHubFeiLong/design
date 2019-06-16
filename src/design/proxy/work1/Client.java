package design.proxy.work1;

/**
 * @ClassName Client
 * @Description TODO
 * @Author msi
 * @Date 2019/6/16 9:18
 */
public class Client {
	public static void main(String[] args) {
		AbstractSubject as = new ProxySubject();
		as.method();
	}
}
