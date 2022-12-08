package design.chain.of.responsibility;

/**
 * @ClassName Approver
 * @Description TODO 审批者类，充当抽象处理者
 * @Author msi
 * @Date 2019/6/16 13:14
 */
public abstract class Approver {
	protected Approver successor;  // 定义后继对象
	protected String name;      // 审批者姓名

	public Approver(String name) {
		this.name = name;
	}
	// 设置后继者
	public void setAsuccessor(Approver successor) {
		this.successor = successor;
	}

	// 抽象请求处理方法
	public abstract void processRequest(PurchaseRequest request);

}
