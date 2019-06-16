package design.chainofresponsibility.work;

/**
 * @ClassName Platoon
 * @Description TODO 营长类
 * @Author msi
 * @Date 2019/6/16 14:05
 */
public class Battalion extends Approver{
	public Battalion(String name) {
		super(name);
	}

	/**
	 * 下达指令
	 * @param enemy 情报
	 */
	@Override
	public void giveOrder(Enemy enemy) {
		if(enemy.getNumber() >=50 && enemy.getNumber() < 200){
			// 处理请求
			System.out.println("营长：" + this.name + "下达了作战指令");
		} else {
			// 转发请求
			this.approver.giveOrder(enemy);
		}
	}
}
