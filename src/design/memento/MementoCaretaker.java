package design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 象棋棋子备忘录管理类，充当负责人
 * @ClassName MementoCaretaker
 * @Description TODO
 * @Author msi
 * @Date 2019/6/23 10:35
 */
public class MementoCaretaker {
	/**
	 * 定义一个集合来存储多个备忘录对象，实现多次撤销
	 */
	public List<ChessmanMemento> mementoList = new ArrayList<ChessmanMemento>();

	public ChessmanMemento getMemento(int i) {
		return mementoList.get(i);
	}

	public void setMemento(ChessmanMemento memento) {
		this.mementoList.add(memento);
	}
	/**
	 * 只能实现一次撤销
	 */
//	private ChessmanMemento memento;

//	public ChessmanMemento getMemento() {
//		return memento;
//	}
//
//	public void setMemento(ChessmanMemento memento) {
//		this.memento = memento;
//	}



}
