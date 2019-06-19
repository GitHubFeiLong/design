package design.interpreter;
/**
 *  动作节点类，充当终结符表达式角色
 * @author msi
 * @date 2019年6月19日
 */
public class ActionNode extends AbstractNode{

	private String action;
	
	
	public ActionNode(String action) {
		super();
		this.action = action;
	}


	/**
	 * 动作节点类，充当终结符表达式角色
	 */
	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		if (action.equalsIgnoreCase("move")) {
			return "移动";
		} else if (action.equalsIgnoreCase("run")) {
			return "快速移动";
		} else {
			return "无效指令";
		}
	}

}
