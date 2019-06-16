package design.chainofresponsibility.work;

/**
 * @ClassName Meeting
 * @Description TODO 敌人数量大于了200，需要开会决策
 * @Author msi
 * @Date 2019/6/16 14:07
 */
public class Meeting extends Approver {
	public Meeting(String name) {
		super(name);
	}

	@Override
	public void giveOrder(Enemy enemy) {
		if(enemy.getNumber() >= 200){
			System.out.println(this.name + "召开会议，讨论敌人数量大于200的作战计划");
		}
	}
}
