package design.command.undoredo;

/**
 * @ClassName Client
 * @Description TODO 实现undo包下的简易计算器（只能撤回一次），使其具有更过的撤回
 * @Author msi
 * @Date 2019/6/17 20:18
 */
public class Client {
	public static void main(String[] args) {
		CalculatorForm form = new CalculatorForm();
		AbstractCommand command = new AddCommand();
		form.setCommand(command);

		form.compute(100);
		form.compute(101);
		form.compute(101);
		form.compute(101);
		form.compute(101);
		form.compute(101);
		form.undo();
		form.undo();
		form.compute(101);
		form.undo();
		form.undo();
		form.undo();
		form.compute(101);
		form.undo();
		form.undo();


	}
}
