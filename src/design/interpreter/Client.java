package design.interpreter;
/**
 * 解释器模式
 * 某软件公司要开发一套机器人控制程序,在该机器人控制程序中包含一些简单的英文控制指令,
 * 每一个指令对应一个表达式( expression),该表达式可以是简单表达式也可以是复合表达式,
 * 每一个简单表达式由移动方向( direction),移动方式( action)和移动距离( distance)3部分组成,
 * 其中移动方向包括上(up)、下(down)、左(left)、右( right);移动方式包括移动(move)和快速移动(run);
 * 移动距离为一个正整数。两个表达式之间可以通过与(and)连接形成复mposite)表达式 ,
 * 用户通过对图形化的设置界面进行操作可以创建一个机器人控制指令,机器人在收到指令后将按照指令的
 * 设置进行移动,例如输入控制指令“ up move5”,则“向上移动5个单位”;输入控制指令“downrun10 and left move20”,
 * 则“向下快速移动10个单位再向左移动20个单位”。 现使用解释器模式来设计该程序并模拟实现。
 * @author msi
 * @date 2019年6月19日
 */
public class Client {
	public static void main(String [] args) {
		String instrucation = "down run 10 and left move 20";
		InstrucationHandler handler = new InstrucationHandler();
		
		handler.handle(instrucation);
		String outString = handler.output();
		System.out.println(outString);
	}

}
