package design.template.method;

/**
 * 账户类，充当抽象类
 * @ClassName Account
 * @Description TODO
 * @Author msi
 * @Date 2019/6/27 19:26
 */
public abstract class Account {
	// 基本方法-——具体方法
	public boolean validate(String account, String password){
		System.out.println("账号：" + account);
		System.out.println("密码：" + password);
		if("张无忌".equalsIgnoreCase(account) && "123456".equalsIgnoreCase(password)){
			return true;
		}
		return false;
	}

	// 基本方法-——抽象方法
	public abstract void calculateInterest();

	// 基本方法-——具体方法
	public void display(){
		System.out.println("显示利息");
	}

	// 模板方法
	public void handle(String account, String password){
		if(!validate(account, password)){
			System.out.println("账号密码错误！");
			return;
		}
		calculateInterest();
		display();
	}

}
