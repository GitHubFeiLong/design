package design;

/**
 * @ClassName User
 * @Description TODO
 * @Author cfl
 * @Date 2019/7/30 12:49
 * @Version 1.0
 */
public class User implements Cloneable{
	private int age;
	private String name;
	
	@Override
	public String toString () {
		return "User{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}
	
	public int getAge () {
		return age;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public User (int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public User clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		return (User) obj;
	}
}
