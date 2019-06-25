package design.state;

/**
 * 账户状态类，充当抽象状态类
 * @ClassName AccountState
 * @Description TODO
 * @Author msi
 * @Date 2019/6/25 19:33
 */
public abstract class AccountState {
	protected Account account;  // 状态管理类对象引用

	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void computeInterest();
	public abstract void stateCheck();
}
