package design.proxy;

/**
 * @ClassName Logger
 * @Description TODO 日志记录类（业务类），他提供 log() 方法来保存日志
 * @Author msi
 * @Date 2019/6/15 10:26
 */
public class Logger {
	// 模拟实现日志记录
	public void log(String userId){
		System.out.println("更新数据库，用户’" + userId + "'查询次数加1！");

	}
}
