package design.chain.of.responsibility;

/**
 * @ClassName VicePresident
 * @Description TODO 董事会类，充当具体处理类
 * @Author msi
 * @Date 2019/6/16 13:28
 */
public class Congress extends Approver{

	public Congress(String name) {
		super(name);
	}

	/**
	 * 具体请求处理方法
	 * @param request
	 */
	@Override
	public void processRequest(PurchaseRequest request) {
		System.out.println("召开董事会审批采购单：" + request.getNumber() + "，金额："
				+ request.getAmount() + "元，采购目的：" + request.getPurpose());
	}
}
