package design.visitor;

/**
 * 兼职员工类，充当具体元素类
 * @ClassName FulltimeEmployee
 * @Description TODO
 * @Author msi
 * @Date 2019/6/29 9:10
 */
public class ParttimeEmployee implements Employee {
	private String name;    // 员工姓名
	private double hourWage;  // 员工周薪
	private int workTime;   // 工作时间


	public ParttimeEmployee(String name, double hourWage, int workTime) {
		this.name = name;
		this.hourWage = hourWage;
		this.workTime = workTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHourWage() {
		return hourWage;
	}

	public void setHourWage(double hourWage) {
		this.hourWage = hourWage;
	}

	public int getWorkTime() {
		return workTime;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

	@Override
	public void accept(Department handler) {
		// 调用访问者的访问方法
		handler.visit(this);
	}
}
