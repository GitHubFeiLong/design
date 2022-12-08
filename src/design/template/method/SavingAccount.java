package design.template.method;

/**
 * 定期账户类：具体子类
 * @ClassName SavingAccount
 * @Description TODO
 * @Author msi
 * @Date 2019/6/27 19:33
 */
public class SavingAccount extends Account {
	// 覆盖父类的抽象基本方法
	@Override
	public void calculateInterest() {
		System.out.println("按定期利率计算利息！");
	}
}
