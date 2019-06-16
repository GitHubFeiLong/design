package design.proxy.work1;

/**
 * @ClassName RealSubject
 * @Description TODO 真实主题角色类
 * @Author msi
 * @Date 2019/6/16 9:14
 */
public class RealSubject extends AbstractSubject{
	@Override
	public void method() {
		System.out.println("RealSubject真实主题角色的方法 method() 被调用");
	}
}
