package design.state;

/**
 * 透支状态类，充当具体状态类
 * @ClassName OverdraftState
 * @Description TODO
 * @Author msi
 * @Date 2019/6/25 19:50
 */
public class OverdraftState extends AccountState{

	public OverdraftState(AccountState accountState) {
		this.account = accountState.account;
	}

	@Override
	public void deposit(double amount) {
		account.setBalance(account.getBalance() + amount);
		stateCheck();
	}

	@Override
	public void withdraw(double amount) {
		account.setBalance(account.getBalance() - amount);
		stateCheck();
	}

	@Override
	public void computeInterest() {
		System.out.println("计算利息");
	}

	@Override
	public void stateCheck() {
		if(account.getBalance() > 0){
			account.setState(new NormalState(this));
		} else if(account.getBalance() == -2000){
			account.setState(new RestrictedState(this));
		} else if(account.getBalance() < -2000){
			System.out.println("操作受限");
		}
	}
}
