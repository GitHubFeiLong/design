package design.interpreter;
/**
 * 距离节点类，充当终结符表达式角色
 * @author msi
 * @date 2019年6月19日
 */
public class DistanceNode extends AbstractNode{

	private String distance;
	
	public DistanceNode(String distance) {
		super();
		this.distance = distance;
	}

	/**
	 * 距离表达式解释操作
	 */
	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		return this.distance;
	}

}
