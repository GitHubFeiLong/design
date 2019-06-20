package design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式（Iterator Pattern）: 提供一种方法顺序访问一个聚合对象中的各个元素，
 * 而又不用暴露该对象的内部表示。又称为游标（Cursor）模式
 * @ClassName Client
 * @Description TODO
 * @Author msi
 * @Date 2019/6/20 19:11
 */
public class Client {
	public static void main(String[] args) {
		List<Object> products = new ArrayList<Object>();
		products.add("倚天剑");
		products.add("屠龙刀");
		products.add("芭蕉扇");
		products.add("如意金箍棒");
		products.add("九齿钉耙");
		products.add("袈裟");

		AbstractObjectList list;
		AbstractIterator iterator;

		// 创建聚合对象
		list = new ProductList(products);
		// 创建迭代器对象
		iterator = list.createIterator();
		System.out.println("正向遍历：");
		while(!iterator.isLast()){
			System.out.print(iterator.getNextItem() + ",");
			iterator.next();
		}
		System.out.println();
		System.out.println("================");
		System.out.println("逆向遍历：");
		while(!iterator.isFirst()){
			System.out.print(iterator.getPreviousItem() + ",");
			iterator.previous();
		}

	}

}
