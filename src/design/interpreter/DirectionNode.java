package design.interpreter;
/**
 *  方向节点类，充当终结符表达式角色
 * @author msi
 * @date 2019年6月19日
 */
public class DirectionNode extends AbstractNode{

	private String direction;
	
	
	public DirectionNode(String direction) {
		super();
		this.direction = direction;
	}


	/**
	 * 方向表达式解释操作
	 */
	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		if (direction.equalsIgnoreCase("up")) {
			return "向上";
		} else if (direction.equalsIgnoreCase("down")) {
			return "向下";
		} else if (direction.equalsIgnoreCase("left")) {
			return "向左";
		} else if (direction.equalsIgnoreCase("right")) {
			return "向右";
		} else {
			return "无效指令";
		}
	}

}
