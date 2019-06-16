package design.chainofresponsibility.work;

/**
 * @ClassName Squad
 * @Description TODO 班长，具体处理者类
 * @Author msi
 * @Date 2019/6/16 14:02
 */
public class Squad extends Approver{

	public Squad(String name) {
		super(name);
	}

	/**
	 * 下达指令
	 * @param enemy 情报
	 */
	@Override
	public void giveOrder(Enemy enemy) {
		if(enemy.getNumber() < 10){
			// 处理请求
			System.out.println("班长：" + this.name + "下达了作战指令");
		} else {
			// 转发请求
			this.approver.giveOrder(enemy);
		}
	}
}
