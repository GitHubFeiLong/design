package design.decorator;
/**
 * 装饰模式
 * @author msi
 * @date 2019年6月19日
 */
public class Client {
	public static void main(String [] args) {
		// 1.使用抽象构件类定义全部对象
//		Component component, componentSB, componentBB;
//		// 2.创建具体构建类
//		component = new Window();
//		
//		// 3.创建装饰后的（滚动条）构件对象
//		componentSB = new ScrollBarDecorator(component);
//		// 4.将装饰了一次的对象注入到另一个装饰类(黑色边框)中，进行二次装饰
//		componentBB = new BlackBorderDecorator(componentSB);
//		
//		componentBB.display();
//		
		Component o1;
		o1 = new TextBox();
		ScrollBarDecorator sb = new ScrollBarDecorator(o1);
		BlackBorderDecorator bb = new BlackBorderDecorator(sb);
		bb.setBlackBorder();
//		bb.display();
		
	}

}
