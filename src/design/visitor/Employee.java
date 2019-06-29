package design.visitor;

/**
 * 员工类，充当抽象元素类
 * @ClassName Employee
 * @Description TODO
 * @Author msi
 * @Date 2019/6/29 9:08
 */
public interface Employee {
	public void accept(Department handler); // 接受一个抽象访问者的访问
}
