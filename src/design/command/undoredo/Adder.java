package design.command.undoredo;

/**
 * @ClassName Adder
 * @Description TODO 加法类 Adder 充当请求接收者
 * @Author msi
 * @Date 2019/6/17 19:48
 */
public class Adder {
	private int num = 0;    // 定义初始值为0
	public int result; // 每次处理后的结果；
	public int add(int value){
		result += value;
		return result;
	}
}
