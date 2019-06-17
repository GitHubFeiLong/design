package design.command.queue;

import design.command.Command;

import java.util.ArrayList;

/**
 * @ClassName CommandQueue
 * @Description TODO 命令队列（发送一个请求，多个接收者产生响应）
 * @Author msi
 * @Date 2019/6/17 19:29
 */
public class CommandQueue {
	// 定义一个ArrayList 来存储命令队列
	private ArrayList<Command> commands = new ArrayList<Command>();

	/**
	 * 增加命令
	 * @param command
	 */
	public void addCommand(Command command){
		commands.add(command);
	}

	/**
	 * 删除命令
	 * @param command
	 */
	public void removeCommand(Command command){
		commands.remove(command);
	}

	/**
	 * 循环调用每一个命令对象的 execute() 方法
	 */
	public void execute(){
		for (Command command : commands) {
			command.execute();
		}
	}

}
