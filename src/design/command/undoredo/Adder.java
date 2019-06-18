package design.command.undoredo;

/**
 * @ClassName Adder
 * @Description TODO 加法类 Adder 充当请求接收者
 * @Author msi
 * @Date 2019/6/17 19:48
 */
public class Adder {
	public static int num = 0;
	public int add(int value){
		Adder.num += value;
		return Adder.num;
	}
}
