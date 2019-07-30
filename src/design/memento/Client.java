package design.memento;

/**
 * 备忘录模式（Memento Pattern）：在不破坏封装的前提下捕获一个对象的内部状态，
 * 并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。，其别名
 * 为标记模式。
 * 某软件公司要使用Java语言开发一款可以运行在 Android平台的触摸式中国象棋软件,
 * 由于考虑到有些用户是“菜鸟”,经常不小心走错棋;还有些用户因为不习惯使用手指
 * 在手机屏幕上拖动棋子,常常出现操作失误,因此该中国象棋软件要提供“悔棋”功能,
 * 用户走错棋或操作失误后可恢复到前一个步骤
 * @ClassName Client
 * @Description TODO
 * @Author msi
 * @Date 2019/6/23 10:26
 */
public class Client {
	/**
	 * 定义一个索引来记录当前状态所在的位置
	 */
	private static int index = -1;
	private static MementoCaretaker mc = new MementoCaretaker();

	public static void main(String[] args) {
		Chessman chess = new Chessman("车",1,1);
		play(chess);
		System.out.println("index = " + index);
		chess.setX(4);
		play(chess);
		System.out.println("index = " + index);
		chess.setY(4);
		play(chess);
		System.out.println("index = " + index);
		System.out.println(mc.mementoList);
		undo(chess,index);
		System.out.println("index = " + index);
		
		undo(chess,index);
		redo(chess,index);
		undo(chess,index);
	}

	/**
	 * 下棋;向负责人中添加备忘录信息
	 * @param chessman
	 */
	public static void play(Chessman chessman){
		// 保存备忘录
		mc.setMemento(chessman.save());
		index ++;
		display(chessman);
		System.out.println("list = " + mc.mementoList);
	}

	/**
	 * 悔棋
	 * @param chessman
	 * @param i
	 */
	public static void undo(Chessman chessman, int i){
		System.out.println("********悔棋********");
		index --;
		chessman.restore(mc.getMemento(i - 1));
		display(chessman);
		System.out.println("list = " + mc.mementoList);
		
	}

	/**
	 * 撤销悔棋
	 * @param chessman
	 * @param i
	 */
	public static void redo(Chessman chessman, int i){
		System.out.println("=======撤销悔棋======");
		index ++;
		chessman.restore(mc.getMemento(i + 1));
		display(chessman);
	}

	public static void display(Chessman chessman){
		System.out.println("棋子" + chessman.getLabel() + "当前位置为：第" + chessman.getX() + "行,第"
				+  chessman.getY() + "列");
	}

}
