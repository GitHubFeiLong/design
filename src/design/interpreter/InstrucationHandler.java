package design.interpreter;

import java.util.Stack;

/**
  * 指令处理类,工具类,提供相应的方法对输入指令进行处理。它将输入指令分割为字符串数组,将第一个、
  * 第二个和第三个单词组合成一个句子,并存入栈中;如果发现有单词“and”,则将“and”后的第一个、第二个和第三个单词组合成一个新的句子
  * 作为“and”的右表达式,并从栈中取出原先所存的句子作为左表达式,然后组合成一个And节点存人栈中。依此类推,直到整个指令解析结束
 * @author msi
 * @date 2019年6月19日
 */
public class InstrucationHandler {
	private AbstractNode node;
	
	public void handle(String instrucation) {
		AbstractNode left = null, right = null;
		AbstractNode direction = null, action = null, distance = null;
		
		// 声明一个栈对象用于存储抽象语法树
		Stack<AbstractNode> stack = new Stack<AbstractNode>();
		// 以空格分隔指令字符
		String[] words = instrucation.split(" ");
		for(int i = 0; i < words.length; i++) {
			
			if(words[i].equalsIgnoreCase("and")) {
				// 弹出栈顶表达式作为做表达式
				left = (AbstractNode) stack.pop();
				String word1 = words[++i];
				direction = new DirectionNode(word1);
				action = new ActionNode(words[++i]);
				distance = new DistanceNode(words[++i]);
				// 右表达式
				right = new SentenceNode(direction, action, distance);
				// 将新表达式压入栈中
				stack.push(new AndNode(left, right));
				System.out.println(stack);
			} else {
				String word1 = words[i];
				direction = new DirectionNode(word1);
				action = new ActionNode(words[++i]);
				distance = new DistanceNode(words[++i]);
				// 左表达式
				left = new SentenceNode(direction, action, distance);
				// 将新表达式压入栈中
				stack.push(left);
				System.out.println(stack);
			}
		}
		// 将全部表达式中栈中取出
		this.node = stack.pop();
		System.out.println("end");
		System.out.println(stack);
	}
	
	public String output() {
		String result = node.interpret();
		return result;
	}
}
