package design.proxy;

/**
 * @ClassName Searcher
 * @Description TODO 抽象查询类，充当抽象主题角色，他声明了 doSearcher() 方法
 * @Author msi
 * @Date 2019/6/15 10:28
 */
public interface Searcher {
	String doSearcher(String userId, String keyword);
}
