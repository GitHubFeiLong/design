package design.proxy;

/**
 * @ClassName AccessValidator
 * @Description TODO 身份验证类（业务类），他提供 validate() 方法来实现身份验证
 * @Author msi
 * @Date 2019/6/15 10:21
 */
public class AccessValidator {
	// 模拟实现登陆验证
	public boolean validate(String userId){
		System.out.println("在数据库中验证用户'" + userId +"'是否是合法用户");
		if (userId.equalsIgnoreCase("杨过")){
			System.out.println("'" + userId + "'登陆成功");
			return true;
		} else {
			System.out.println("'" + userId + "'登陆失败");
			return false;
		}
	}
}
