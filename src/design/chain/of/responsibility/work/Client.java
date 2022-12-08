package design.chain.of.responsibility.work;

/**
 * @ClassName Client
 * @Description TODO
 * @Author msi
 * @Date 2019/6/16 14:09
 */
public class Client {
	public static void main(String[] args) {
		Approver ap1, ap2, ap3, ap4;
		ap1 = new Squad("悟净");
		ap2 = new Platoon("悟能");
		ap3 = new Battalion("悟空");
		ap4 = new Meeting("唐僧");

		// 设置后继责任对象
		ap1.setApprover(ap2);
		ap2.setApprover(ap3);
		ap3.setApprover(ap4);

		Enemy e1 = new Enemy(199);
		ap1.giveOrder(e1);
		Enemy e2 = new Enemy(30);
		ap1.giveOrder(e2);
		Enemy e3 = new Enemy(150);
		ap1.giveOrder(e3);
		Enemy e4 = new Enemy(300);
		ap1.giveOrder(e4);
	}
}
