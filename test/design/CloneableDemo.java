package design;

/**
 * @ClassName CloneableDemo
 * @Description TODO
 * @Author cfl
 * @Date 2019/7/30 12:49
 * @Version 1.0
 */
public class CloneableDemo {
	public static void main (String[] args) throws Exception{
		User u = new User(19, "陈飞龙");
		System.out.println(u);
		User u2 = u.clone();
		System.out.println(u2);
		u2.setAge(100);
		System.out.println(u);
		System.out.println(u2);
		
	}
}
