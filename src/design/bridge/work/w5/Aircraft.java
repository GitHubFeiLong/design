package design.bridge.work.w5;

/**
 * 类描述：
 * 抽象类
 * @author cfl
 * @date 2022/12/15 20:48
 * @version 1.0
 */
public abstract class Aircraft {
	protected Manufacturer imp;
	public void setImp(Manufacturer imp) {
		this.imp = imp;
	}
	
	public abstract void doSomething();

}
