package design.state;

/**
 * 状态模式（State Pattern）：允许一个对象在其内部状态改变时改变它的行为。
 * 对象看起来似乎修改了它的类。又名状态对象
 *
 * @ClassName Client
 * @Description TODO
 * @Author msi
 * @Date 2019/6/25 19:07
 */
public class Client {
	public static void main(String[] args) {
		Account account = new Account("段誉", 0.0);
		account.deposit(1000);
		account.withdraw(2000);
		account.deposit(3000);
		account.withdraw(5000);
		account.withdraw(1000);
		account.computeInterest();
	}
}
