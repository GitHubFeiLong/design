package design.command.undoredo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CalculatorForm
 * @Description TODO 简易计算器：充当请求发送者
 * @Author msi
 * @Date 2019/6/17 19:58
 */
public class CalculatorForm {
	private AbstractCommand command;
	
	public void setCommand(AbstractCommand command) {
		this.command = command;
	}
	
	public void add(int value){
		int i = command.execute(value);
		System.out.println("执行加法后结果为：" + i);
	}
	public void undo(){
		int i = command.undo();
		// 将上次结果值改为撤销后的值
		Adder.num = i;
		System.out.println("执行撤销后结果为：" + i);
	}
}
