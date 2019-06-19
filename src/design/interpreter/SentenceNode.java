package design.interpreter;
/**
 * 简单句子节点类，充当非终结符表达式
 * @author msi
 * @date 2019年6月19日
 */
public class SentenceNode extends AbstractNode{

	private AbstractNode direction;	// 方向
	private AbstractNode action;	// 行动
	private AbstractNode distance;	// 距离
	
	
	public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
		super();
		this.direction = direction;
		this.action = action;
		this.distance = distance;
	}

	/**
	 *  简单句子的解释操作
	 */
	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		return direction.interpret() + action.interpret() + distance.interpret();
	}

}
