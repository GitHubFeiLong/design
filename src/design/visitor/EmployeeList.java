package design.visitor;

import java.util.ArrayList;

/**
 * 员工列表类，充当对象结构
 * @ClassName EmployeeList
 * @Description TODO
 * @Author msi
 * @Date 2019/6/29 9:35
 */
public class EmployeeList {
	// 定义一个集合用于存储员工对象
	private ArrayList<Employee> list = new ArrayList<Employee>();
	public void addEmployee(Employee employee){
		list.add(employee);
	}
	public void accept(Department department){
		for(Employee e : list){
			// 循环遍历员工对象
			e.accept(department);
		}
	}
}
