package design.flyweight;

import java.util.Hashtable;

/**
 * @ClassName IgoChessmanFactory
 * @Description TODO 围棋棋子工厂类，充当享元工厂类，使用单例对其进行设计
 * @Author msi
 * @Date 2019/6/14 19:27
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable ht;    // 使用Hashtable 来存储享元对象，充当享元池

	private IgoChessmanFactory(){
		ht = new Hashtable();
		IgoChessman black, white;
		black = new BlackIgoChessman();
		ht.put("b", black);
		white = new WhiteIgoChessman();
		ht.put("w", white);
	}

	// 返回享元工厂类的唯一实例
	public static IgoChessmanFactory getInstance(){
		return instance;
	}

	// 通过 Key 获取存储在 Hashtable 中的享元对象
	public static IgoChessman getIgoChessman(String color){
		return (IgoChessman) ht.get(color);
	}
}
