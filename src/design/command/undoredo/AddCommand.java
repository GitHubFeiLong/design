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
	private Adder adder = new Adder();
	public static ArrayList<Integer> history = new ArrayList<Integer>();   // 装历史结果
	
	private boolean flag = false;   // 开关调用撤销undo方法为true。
	private boolean boo = false;    // 开关：已经撤回到原始状态，再次撤销不添加历史记录
	private int count = 0;  // 用于记录撤销的次数，中途运算就归0
	/**
	 * 执行运算
	 * @Param [number]
	 * @Return int
	 */
	@Override
	public int execute(int number) {
		int i = adder.add(number);
		AddCommand.history.add(i);
		flag = false;
		count = 0;
		return i;
	}
	
	/**
	 * 执行撤销
	 * @Param []
	 * @Return int
	 */
	@Override
	public int undo() {
		int i= 0;
		int len = AddCommand.history.size() -1; //索引
		count ++;   // 执行撤销计次
		
		// 历史记录只有一条数据，或者是连续撤销到最初始的一条数据
		if (len <= 0 || len < 2 * count -1){
			// 防止重复添加0到历史记录
			if (!boo){
				System.out.println("最初状态");
				AddCommand.history.add(i);
			} else{
				System.out.println("已经是最原始状态撤销失败！");
			}
			boo = true;
			return 0;
		}
		// 一次撤销
		if (count == 1){
			i = AddCommand.history.get(len -1);
		}
		// 连续撤销
		if (flag){
			i = AddCommand.history.get(len - (2 * count -1));
		}
		
		AddCommand.history.add(i);
		flag = true;
		return i;
	}
}
