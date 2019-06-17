package design.command.undoredo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AddCommand
 * @Description TODO 具体命令类，实现execute执行方法和undo撤销方法
 * @Author msi
 * @Date 2019/6/17 19:50
 */
public class AddCommand extends AbstractCommand {
	private Adder adder = new Adder();  // 维持一个接收请求对象的引用

	private int value;  // 为了得到加法中的参数值

	private int index = 1;  // 记录历史记录表的下标
	public List<Integer> lists = new ArrayList<Integer>();     // 装历史记录

	{
		lists.add(0);
	}

	/**
	 * 实现抽象类声明的 execute() 方法，调用加法类Adder的add方法
	 * @param value
	 * @return
	 */
	@Override
	public int execute(int value) {
		System.out.println("index = " + index);
		this.value = value;     // 将加数保留
		int i = adder.add(value);
		adder.result = i;
		lists.add(i);   // 将结果装进‘历史记录’
		System.out.println(lists);
		this.index++;   // 下标加1
		return i;
	}

	/**
	 * 实现一个抽象类声明的 undo() 方法,通过加一个相反数来实现加法的逆向操作
	 * @return
	 */
	@Override
	public int undo() {
		System.out.println("index = " + index);
		int i = 0;
		if (lists.size() <= 1){
			i = adder.add(-value);
		} else{
			if(index < 2){
				System.out.println("已经撤销不了了");
				return 0;
			}
			this.index -= 2;   // 下标减1
			i = lists.get(this.index);
			this.index += 1;    // 因为每次撤销后得到的值，都放进了数组，所以下标也会增加1
		}
		adder.result = i;
		lists.add(i);   // 将结果装进‘历史记录’
		System.out.println(lists);
		return i;
	}
}
