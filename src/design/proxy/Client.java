package design.proxy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author msi
 * @Date 2019/6/15 10:44
 */
public class Client {
	public static void main(String[] args) {
		Searcher searcher;
		// 这里可以使用配置文件来做到开闭原则
		searcher = new ProxySearcher();
		String result = searcher.doSearcher("杨过", "玉女心经");
	}
}
