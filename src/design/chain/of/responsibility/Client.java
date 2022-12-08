package design.chain.of.responsibility;

/**
 * 职责链模式（责任链模式）
 * @ClassName Client
 * @Description TODO
 * @Author msi
 * @Date 2019/6/16 13:35
 */
public class Client {
	public static void main(String[] args) {
		Approver wjzhang, gyang, jguo, metting;
		wjzhang = new Director("张无忌");
		gyang = new VicePresident("杨过");
		jguo = new President("郭靖");
		metting = new Congress("武林大会");

		// 创建责任链/职责链
		wjzhang.setAsuccessor(gyang);
		gyang.setAsuccessor(jguo);
		jguo.setAsuccessor(metting);

		// 创建采购单
		PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "购买倚天剑");
		wjzhang.processRequest(pr1);
		PurchaseRequest pr2 = new PurchaseRequest(60000, 10002, "购买《葵花宝典》");
		wjzhang.processRequest(pr2);
		PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "购买《玉女心经》");
		wjzhang.processRequest(pr3);
		PurchaseRequest pr4 = new PurchaseRequest(800000, 10004, "购买桃花岛");
		wjzhang.processRequest(pr4);
	}
}
