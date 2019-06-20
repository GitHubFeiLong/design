package design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象聚合类
 * @ClassName AbstractObjectList
 * @Description TODO
 * @Author msi
 * @Date 2019/6/20 19:23
 */
public abstract class AbstractObjectList {
	protected List<Object> objects = new ArrayList<Object>();

	public AbstractObjectList(List<Object> objects) {
		this.objects = objects;
	}
	public void addObject(Object object){
		this.objects.add(object);
	}
	public void removeObject(Object object){
		this.objects.remove(object);
	}

	public List<Object> getObjects(){
		return this.objects;
	}

	/**
	 * 声明创建迭代器对象的抽象工厂方法
	 * @return
	 */
	public abstract AbstractIterator createIterator();
}
