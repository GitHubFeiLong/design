package design.mediator;

/**
 * 中介者模式(Mediator Pattern)：定义一个对象来封装一系列对象的交互。中介者模式使各对象之间不需要显示地相互引用，
 * 从而使其耦合松散，而且用户可以独立地改变他们之间的交互，又称调停者模式。
 * @ClassName Client
 * @Description TODO
 * @Author msi
 * @Date 2019/6/22 8:48
 */
public class Client {
	public static void main(String[] args) {
		ConcreteMediator mediator;
		mediator = new ConcreteMediator();

		// 定义同事对象
		Button addBT = new Button();
		List list = new List();
		ComboBox cb = new ComboBox();
		TextBox userNameTB = new TextBox();

		addBT.setMediator(mediator);
		list.setMediator(mediator);
		cb.setMediator(mediator);
		userNameTB.setMediator(mediator);

		mediator.addButton = addBT;
		mediator.list = list;
		mediator.cb = cb;
		mediator.userNameTextBox = userNameTB;
		addBT.change();
		System.out.println("===========");
		list.change();
	}
}
