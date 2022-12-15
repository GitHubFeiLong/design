package design.bridge.work.w5;

/**
 * 类描述：
 * 扩充抽象类
 * @author cfl
 * @date 2022/12/15 20:49
 * @version 1.0
 */
public class Passenger extends Aircraft{

	@Override
	public void doSomething() {
		imp.sayHi();
		System.out.println("承载旅客");
		
	}

}
