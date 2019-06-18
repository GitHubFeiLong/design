package design.command.undoredo;

/**
 * 加法运算，实现了加法和撤销方法，连续撤销到初始条数据便不能撤销，在是爱你一次运算后，又能继续撤销
 * @ClassName Client
 * @Description TODO 撤销方法
 * @Author msi
 * @Date 2019/6/17 20:18
 */
public class Client {
	public static void main(String[] args) {
		CalculatorForm form = new CalculatorForm();
		AbstractCommand command = new AddCommand();
		form.setCommand(command);
		form.add(100);
		form.add(100);
		form.add(100);
		
		form.undo();
		form.undo();
		form.undo();
		form.undo();
		form.add(100);
		form.undo();
		form.undo();
		form.undo();
		form.undo();


	}
}
