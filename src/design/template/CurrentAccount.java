package design.template;

/**
 * 活期账户类，充当具体子类
 * @ClassName CurrentAccount
 * @Description TODO
 * @Author msi
 * @Date 2019/6/27 19:32
 */
public class CurrentAccount extends Account{
	// 覆盖父类的抽象方法
	@Override
	public void calculateInterest() {
		System.out.println("按活期利率计算");
	}
}
