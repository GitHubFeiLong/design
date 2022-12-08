package design.chain.of.responsibility.work;

/**
 * @ClassName Approver
 * @Description TODO 审批者类，充当抽象处理者类
 * @Author msi
 * @Date 2019/6/16 13:57
 */
public abstract class Approver {
	protected String name;      // 下达命令人职级
	protected Approver approver;    // 上级

	public Approver(String name) {
		this.name = name;
	}

	public void setApprover(Approver approver) {
		this.approver = approver;
	}

	public abstract void giveOrder(Enemy enemy);
}
