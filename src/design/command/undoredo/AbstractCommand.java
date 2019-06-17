package design.command.undoredo;

/**
 * @ClassName AbstractCommand
 * @Description TODO
 * @Author msi
 * @Date 2019/6/17 19:49
 */
public abstract class AbstractCommand {
	public abstract int execute(int value);     // 声明命令执行方法
	public abstract int undo();     // 声明撤销方法
}
