package design.proxy;

/**
 * @ClassName ProxySearcher
 * @Description TODO 代理查询类，充当代理主题角色，它是查询代理，维持了对 RealSearcher 对象、
 * @Description TODO AccessValidator 对象和 Logger 对象的引用
 * @Author msi
 * @Date 2019/6/15 10:33
 */
public class ProxySearcher implements Searcher {
	// 维持一个对真实主题的引用
	private RealSearcher searcher = new RealSearcher();
	private AccessValidator validator;
	private Logger logger;



	//
	@Override
	public String doSearcher(String userId, String keyword) {
		// 如果身份验证成功，则执行查询
		if (this.validate(userId)){
			// 调用真实主题对象的查询方法
			String result = searcher.doSearcher(userId, keyword);
			// 记录查询日志
			this.log(userId);
			// 返回结果
			return result;
		}

		return null;

	}

	// 创建访问验证对象并调用其 validate() 方法实现身份验证
	public boolean validate(String userId){
		validator = new AccessValidator();
		return validator.validate(userId);
	}

	// 创建日志记录对象并调用其 log() 方法实现日志记录
	public void log(String userId){
		logger = new Logger();
		logger.log(userId);
	}
}
