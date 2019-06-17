package design.command.undo;

/**
 * @ClassName AbstractCommand
 * @Description TODO 抽象命令类
 * @Author msi
 * @Date 2019/6/17 19:49
 */
public abstract class AbstractCommand {
	public abstract int execute(int value);     // 声明命令执行方法
	public abstract int undo();     // 声明撤销方法
}
