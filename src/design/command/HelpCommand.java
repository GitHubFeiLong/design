package design.command;

/**
 * @ClassName HelpCommand
 * @Description TODO
 * @Author msi
 * @Date 2019/6/17 19:21
 */
public class HelpCommand extends Command {

	private DisplayHelpClass hcObj;     // 维持对请求对象接收者的引用

	public HelpCommand() {
		hcObj = new DisplayHelpClass();
	}

	@Override
	public void execute() {
		hcObj.display();
	}
}
