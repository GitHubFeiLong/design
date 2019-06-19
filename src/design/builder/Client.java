package design.builder;

/**
 * 构建者模式
 * Client:客户端测试类
 * @author msi
 * @date 2019年5月20日
 */
public class Client {
	public static void main(String [] args) {
		// 针对抽象建造者编程
		ActorBuilder ab;
		// 反射生成具体建造者对象
		ab = (ActorBuilder) XMLUtil.getBean();
		
		ActorController controller = new ActorController();
		Actor actor;
		// 通过指挥者创建完整的建造者对象
		actor = controller.construct(ab);
		
		System.out.println(actor);
	}
}
