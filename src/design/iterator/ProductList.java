package design.iterator;

import java.util.List;

/**
 * 商品数据类，充当具体聚合类
 * @ClassName ProductList
 * @Description TODO
 * @Author msi
 * @Date 2019/6/20 19:46
 */
public class ProductList extends AbstractObjectList{

	public ProductList(List<Object> objects) {
		super(objects);
	}

	/**
	 * 实现创建迭代器对象的具体工厂方法
	 * @return
	 */
	@Override
	public AbstractIterator createIterator() {
//		return new ProductIterator(objects);
		return new ProductIterator();


	}

	/**
	 * 使用匿名内部类
	 */
	private class ProductIterator extends AbstractIterator {
		private int cursor1;
		private int cursor2;

		public ProductIterator() {
			this.cursor1 = 0;
			this.cursor2 = objects.size() - 1;
		}

		@Override
		public void next() {
			if(cursor1 < objects.size()){
				cursor1++;
			}
		}

		@Override
		public boolean isLast() {
			return cursor1 == objects.size();
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
			return objects.get(cursor1);
		}

		@Override
		public Object getPreviousItem() {
			return objects.get(cursor2);
		}
	}

}
