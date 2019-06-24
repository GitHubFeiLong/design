package design.memento;

/**
 * 象棋棋子类，充当原发器类
 * @ClassName Chessman
 * @Description TODO
 * @Author msi
 * @Date 2019/6/23 10:29
 */
public class Chessman {
	private String label;
	private int x;
	private int y;

	public Chessman(String label, int x, int y) {
		this.label = label;
		this.x = x;
		this.y = y;
	}

	/**
	 * 保存状态
	 * @return
	 */
	public ChessmanMemento save(){
		return new ChessmanMemento(this.label, this.x, this.y);
	}

	/**
	 * 恢复状态
	 * @param memento
	 */
	public void restore(ChessmanMemento memento){
		this.label = memento.getLabel();
		this.x = memento.getX();
		this.y = memento.getY();
	}

	/*getter，setter*/
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
