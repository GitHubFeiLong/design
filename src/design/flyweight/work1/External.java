package design.flyweight.work1;

/**
 * @ClassName External
 * @Description TODO 外部状态享元模式
 * @Author msi
 * @Date 2019/6/14 20:28
 */
public class External {
	private String address;
	private String size;

	public External(String address, String size) {
		this.address = address;
		this.size = size;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
