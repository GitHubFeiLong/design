package design.command.undo;

/**
 * @ClassName Client
 * @Description TODO 执行命令模式中的撤销
 * @Author msi
 * @Date 2019/6/17 20:03
 */
public class Client {
	public static void main(String[] args) {
		CalculatorForm form = new CalculatorForm();
		AbstractCommand command = new AddCommand();
		form.setCommand(command);

		form.compute(100);
		form.compute(101);
		form.undo();
	}
}
