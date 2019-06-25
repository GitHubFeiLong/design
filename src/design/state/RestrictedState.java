package design.state;

/**
 * 受限状态类：充当具体状态类
 * @ClassName RestrictedState
 * @Description TODO
 * @Author msi
 * @Date 2019/6/25 19:55
 */
public class RestrictedState extends AccountState {
	public RestrictedState(AccountState accountState) {
		this.account = accountState.account;
	}

	@Override
	public void deposit(double amount) {
		account.setBalance(account.getBalance() + amount);
		stateCheck();
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("账号受限，取款失败");
	}

	@Override
	public void computeInterest() {
		System.out.println("计算利息");
	}

	@Override
	public void stateCheck() {
		if(account.getBalance() > 0){
			account.setState(new NormalState(this));
		} else if (account.getBalance() > -2000){
			account.setState(new OverdraftState(this));
		}
	}
}
