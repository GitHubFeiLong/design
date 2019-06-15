package design.proxy.dynamic;

/**
 * @ClassName UserDAO
 * @Description TODO 用户 DAO 类，具体主题角色
 * @Author msi
 * @Date 2019/6/15 11:14
 */
public class UserDAO implements AbstractUserDAO {

	@Override
	public Boolean findUserById(String userId) {
		if (userId.equalsIgnoreCase("张无忌")) {
			System.out.println("查询ID为’" + userId +"'的用户信息成功！");
			return true;
		}
		System.out.println("查询ID为’" + userId +"'的用户信息失败！");
		return false;
	}
}
