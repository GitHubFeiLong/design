package design.visitor;

/**
 * 部门类，充当抽象访问者类
 * @ClassName Department
 * @Description TODO
 * @Author msi
 * @Date 2019/6/29 9:13
 */
public abstract class Department {
	// 声明一组重载方法，用于访问不同类型的具体元素
	public abstract void visit(FulltimeEmployee employee);
	public abstract void visit(ParttimeEmployee employee);
}
