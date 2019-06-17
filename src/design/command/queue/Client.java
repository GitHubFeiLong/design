package design.command.queue;

import design.command.Command;
import design.command.ExitCommand;
import design.command.HelpCommand;

/**
 * @ClassName Client
 * @Description TODO 请求队列CommandQueue
 * @Author msi
 * @Date 2019/6/17 19:38
 */
public class Client {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		CommandQueue commandQueue = new CommandQueue();
		invoker.setCommandQueue(commandQueue);

		// 给命令队列添加命令
		ExitCommand exitCommand = new ExitCommand();
		HelpCommand helpCommand = new HelpCommand();
		commandQueue.addCommand(exitCommand);
		commandQueue.addCommand(helpCommand);
		// 客户端执行命令
		invoker.call();
	}
}
