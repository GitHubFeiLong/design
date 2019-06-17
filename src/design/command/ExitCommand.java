package design.command;

/**
 * @ClassName ExitCommand
 * @Description TODO
 * @Author msi
 * @Date 2019/6/17 19:17
 */
public class ExitCommand extends Command {
	private SystemExitClass seObj;  // 维持一个请求接收对象的引用

	public ExitCommand() {
		seObj = new SystemExitClass();
	}

	/**
	 * 具体命令执行方法
	 */
	@Override
	public void execute() {
		seObj.exit();
	}
}
