package design.iterator;

/**
 * 抽象迭代器
 * @ClassName AbstractIterator
 * @Description TODO
 * @Author msi
 * @Date 2019/6/20 19:48
 */
public abstract class AbstractIterator {
	public abstract void next();     // 移至下一个元素
	public abstract boolean isLast();     // 判断是否为最后一个元素
	public abstract void previous();     // 移至上一个元素
	public abstract boolean isFirst();     // 判断是否为第一个元素
	public abstract Object getNextItem();     // 获取下一个元素
	public abstract Object getPreviousItem();     // 获取上一个元素
}
