package design.proxy.dynamic;

/**
 * @ClassName AbstractUserDao
 * @Description TODO 抽象用户 DAO 类，抽象主题角色
 * @Author msi
 * @Date 2019/6/15 11:12
 */
public interface AbstractUserDAO {
	Boolean findUserById(String userId);
}
