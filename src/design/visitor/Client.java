package design.visitor;

/**
 * 访问者模式（Visitor Pattern）：表示一个作用于某个对象结构中的各个元素的操作。
 * 访问者模式让用户可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
 * @ClassName Client
 * @Description TODO
 * @Author msi
 * @Date 2019/6/29 8:55
 */
public class Client {
	public static void main(String[] args) {
		EmployeeList list = new EmployeeList();
		Employee e1, e2, e3, e4, e5;
		e1 = new FulltimeEmployee("张无忌",3500,40);
		e2 = new FulltimeEmployee("灭绝师太",2750,35);
		e3 = new FulltimeEmployee("张敏",3000,50);
		e4 = new ParttimeEmployee("杨过", 100,13);
		e5 = new ParttimeEmployee("小龙女", 500,8);

		list.addEmployee(e1);
		list.addEmployee(e2);
		list.addEmployee(e3);
		list.addEmployee(e4);
		list.addEmployee(e5);

		FADepartment fa = new FADepartment();
		HRDepartment hr = new HRDepartment();
		// 财务部
		System.out.println("==========财务部==========");
		list.accept(fa);

		// 人力资源部
		System.out.println("=============人力资源部=============");
		list.accept(hr);

	}
}
