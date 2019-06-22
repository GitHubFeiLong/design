package design.mediator;

/**
 * 具体中介者类
 * @ClassName ConcreteMediator
 * @Description TODO
 * @Author msi
 * @Date 2019/6/22 9:03
 */
public class ConcreteMediator extends Mediator{
	public Button addButton;
	public List list;
	public TextBox userNameTextBox;
	public ComboBox cb;

	/**
	 * 封装同事对象之间的交互
	 * @param c
	 */
	@Override
	public void componentChanged(Component c) {
		if(c == addButton){
			System.out.println("------单击按钮----");
			list.update();
			cb.update();
			userNameTextBox.update();
		}
		// 从列表框选择客户
		else if(c == list){
			System.out.println("-------从列表框选择客户------");
			cb.select();
			userNameTextBox.setText();
		}
		// 从组合框选择客户
		else if(c == cb){
			System.out.println("------从组合框选择客户-------");
			cb.select();
			userNameTextBox.setText();
		}

	}
}
