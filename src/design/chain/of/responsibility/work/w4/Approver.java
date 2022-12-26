package design.chain.of.responsibility.work.w4;

/**
 * 审批者类，充当抽象处理者类
 * @ClassName Approver
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
