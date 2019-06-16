package design.proxy.work1;

/**
 * @ClassName ProxySubject
 * @Description TODO 代理主题角色类
 * @Author msi
 * @Date 2019/6/16 9:16
 */
public class ProxySubject extends AbstractSubject{
	private RealSubject real = new RealSubject();
	@Override
	public void method() {
		System.out.println("方法method被调用");
		try{
			real.method();
			System.out.println("方法method调用成功");
		}catch(Exception e){
			System.out.println("方法method调用失败");
			e.printStackTrace();
		}

	}
}
