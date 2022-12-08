package design.chain.of.responsibility.work;

/**
 * @ClassName Platoon
 * @Description TODO 排长类
 * @Author msi
 * @Date 2019/6/16 14:05
 */
public class Platoon extends Approver{
	public Platoon(String name) {
		super(name);
	}

	/**
	 * 下达指令
	 * @param enemy 情报
	 */
	@Override
	public void giveOrder(Enemy enemy) {
		if(enemy.getNumber() >=10 && enemy.getNumber() < 50){
			// 处理请求
			System.out.println("排长：" + this.name + "下达了作战指令");
		} else {
			// 转发请求
			this.approver.giveOrder(enemy);
		}
	}
}
