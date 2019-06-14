package design.flyweight.work;

/**
 * @ClassName TextStyle
 * @Description TODO
 * @Author msi
 * @Date 2019/6/14 20:08
 */
public class TextStyle {
	private int size;
	private String color;

	public TextStyle(int size, String color) {
		this.size = size;
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
