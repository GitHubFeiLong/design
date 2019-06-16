package design.chainofresponsibility;

/**
 * @ClassName Director
 * @Description TODO 主任类，充当具体处理类
 * @Author msi
 * @Date 2019/6/16 13:21
 */
public class Director extends Approver{
	public Director(String name) {
		super(name);
	}

	/**
	 * 具体请求处理方法
	 * @param request
	 */
	@Override
	public void processRequest(PurchaseRequest request) {
		if(request.getAmount() < 50000){
			// 处理请求
			System.out.println("主任" + this.name + "审批采购单：" + request.getNumber() + "，金额："
					+ request.getAmount() + "元，采购目的：" + request.getPurpose());
		} else{
			// 转发请求
			this.successor.processRequest(request);
		}
	}
}
