package design.observer;

/**
 * 观察者模式（Observer Pattern）：定义对象之间的一种一对多的依赖关系，
 * 使得每当一个对象状态发生改变时其依赖对象皆得到通知并自动更新。别名有
 * 发布-订阅模式，模型-视图模式，从属者模式。
 *
 * 实例：在某多人联机对战游戏中，多个玩家可以加入同一战队组成联盟，
 * 的那个战队中的某一成员受到敌人攻击时将给所有其他盟友发送通知，
 * 盟友收到通知后将做出响应。
 * @ClassName Client
 * @Description TODO
 * @Author msi
 * @Date 2019/6/24 19:37
 */
public class Client {
	public static void main(String[] args) {
		AllyControlCenter acc = new ConcreteAllyControlCenter("金庸群侠");

		// 定义四个观察者对象
		Observer player1, player2, player3, player4;
		player1 = new Player("杨过");
		player2 = new Player("令狐冲");
		player3 = new Player("张无忌");
		player4 = new Player("段誉");

		// 将四位英雄添加到 金庸群侠 战队
		acc.join(player1);
		acc.join(player2);
		acc.join(player3);
		acc.join(player4);

		// 某成员遭受攻击
		player1.beAttacked(acc);

	}
}
