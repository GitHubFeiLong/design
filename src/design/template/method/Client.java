package design.template.method;

/**
 * 模板方法模式（Template Pattern）:定义一个操作中算法的框架，而将一些步骤延迟到子类中。
 * 模板方法模式，使得子类可以不改变一个算法的结构即可重定义算法的某些特定步骤
 * @ClassName Client
 * @Description TODO
 * @Author msi
 * @Date 2019/6/27 19:13
 */
public class Client {
	public static void main(String[] args) {
		Account account = new CurrentAccount();
		account.handle("张无忌", "123456");
	}
}
