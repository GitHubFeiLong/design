package design.command.queue;

/**
 * @ClassName Invoker
 * @Description TODO 请求发送者类
 * @Author msi
 * @Date 2019/6/17 19:35
 */
public class Invoker {
	private CommandQueue commandQueue;  // 维持一个命令队列对象的引用

	// 注入命令对象
	public void setCommandQueue(CommandQueue commandQueue) {
		this.commandQueue = commandQueue;
	}

	/**
	 * 发起请求
	 */
	public void call(){
		commandQueue.execute();
	}

}
