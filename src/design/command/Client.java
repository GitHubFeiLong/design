package design.command;

/**
 * @ClassName Client
 * @Description TODO 为了用户使用方便,某系统提供了一系列功能键,
 * TODO 用户可以自定义功能键的功能,例如功能键 FunctionButton可以用于退出系统(
 * TODO 由SystemExitClass类来实现),也可以用于显示帮助文档(由 DisplayHelpClas类来实现)
 * TODO 用户可以通过修改配置文件改变功能键的用途,现使用命令模式设计该系统,
 * TODO 使得功能键类与功能类之间解耦,可为同一个功能键设置不同的功能。
 * @Author msi
 * @Date 2019/6/17 19:10
 */
public class Client {
	public static void main(String[] args) {
		FunctionButton button = new FunctionButton();
		// 可以写一个配置文件来获取具体命令类
		Command command = new HelpCommand();
		// 注入命令对象
		button.setCommand(command);
		// button点击
		button.click();
	}
}
