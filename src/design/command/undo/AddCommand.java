package design.command.undo;

/**
 * @ClassName AddCommand
 * @Description TODO 具体命令类，实现execute执行方法和undo撤销方法
 * @Author msi
 * @Date 2019/6/17 19:50
 */
public class AddCommand extends AbstractCommand {
	private Adder adder = new Adder();  // 维持一个接收请求对象的引用

	private int value;  // 为了得到加法中的参数值

	/**
	 * 实现抽象类声明的 execute() 方法，调用加法类Adder的add方法
	 * @param value
	 * @return
	 */
	@Override
	public int execute(int value) {
		this.value = value;     // 将加数保留
		return adder.add(value);
	}

	/**
	 * 实现一个抽象类声明的 undo() 方法,通过加一个相反数来实现加法的逆向操作
	 * @return
	 */
	@Override
	public int undo() {
		return adder.add(-value);
	}
}
