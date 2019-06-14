package design.flyweight.work;

/**
 * @ClassName Client
 * @Description TODO
 * @Author msi
 * @Date 2019/6/14 20:16
 */
public class Client {
	public static void main(String[] args) {
		TextFlyweightFactory factory = TextFlyweightFactory.getInstance();
		FlyweightAbstract f1, f2, f3, f4;
		f1 = new JavaFlyweight();
		f2 = new JavaFlyweight();
		f3 = new JavaFlyweight();
		f4 = new JavaFlyweight();
		f1.display(new TextStyle(12, "红色"));
		f2.display(new TextStyle(13, "黑色"));
		f3.display(new TextStyle(11, "蓝色"));
		f4.display(new TextStyle(15, "白色"));
	}
}
