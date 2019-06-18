package design.command.undoredo;

/**
 * 抽象命令类
 * @ClassName AbstractCommand
 * @Description TODO
 * @Author msi
 * @Date 2019/6/17 19:49
 */
public abstract class AbstractCommand {
	public abstract int execute(int number); // 执行命令
	public abstract int undo();    // 撤销命令
}
