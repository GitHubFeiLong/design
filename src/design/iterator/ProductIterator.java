package design.iterator;

import java.util.List;

/**
 * 商品迭代器类，充当具体迭代器
 * @ClassName productIterator
 * @Description TODO
 * @Author msi
 * @Date 2019/6/20 19:52
 */
public class ProductIterator extends AbstractIterator{
	private List<Object> products;
	private int cursor1;    // 定义一个游标，用于记录正向遍历的位置
	private int cursor2;    // 定义一个游标，用于记录逆向遍历的位置

	public ProductIterator(List<Object> products) {
		this.products = products;   //获取集合对象
		cursor1 = 0;    // 设置正向遍历游标的初始值
		cursor2 = products.size() - 1;  // 设置逆向遍历游标的初始值
	}

	@Override
	public void next() {
		if(cursor1 < products.size()){
			cursor1++;
		}
	}

	@Override
	public boolean isLast() {
		return cursor1 == products.size();
	}

	@Override
	public void previous() {
		if(cursor2 > -1){
			cursor2--;
		}
	}

	@Override
	public boolean isFirst() {
		return cursor2 == -1;
	}

	@Override
	public Object getNextItem() {
		return products.get(cursor1);
	}

	@Override
	public Object getPreviousItem() {
		return products.get(cursor2);
	}
}
