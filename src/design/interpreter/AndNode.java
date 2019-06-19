package design.interpreter;
/**
 * And节点类，充当非终结符表达式角色
 * @author msi
 * @date 2019年6月19日
 */
public class AndNode extends AbstractNode{

	private AbstractNode left;	// and的左边表达式
	private AbstractNode right;	// and的右边表达式
	
	
	public AndNode(AbstractNode left, AbstractNode right) {
		super();
		this.left = left;
		this.right = right;
	}

	/**
	 * and表达式解释操作
	 */
	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		return left.interpret() + "再" + right.interpret();
	}

}
