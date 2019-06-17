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
	private AbstractCommand command;    // 命令对象引用



	public void setCommand(AbstractCommand command) {
		this.command = command;
	}

	public void compute(int value){
		int i = command.execute(value);
		System.out.println("执行运算，运算结果：" + i);
	}

	public void undo(){
		int i = command.undo();
		System.out.println("执行撤销，运算结果：" + i);
	}

}
