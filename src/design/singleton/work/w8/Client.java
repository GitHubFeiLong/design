package design.singleton.work.w8;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/13 22:11
 */
public class Client {
    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    public static void main(String[] args) {
        DatabasePool instance = DatabasePool.getInstance();
        for (int i = 0; i < 10; i++) {
            System.out.println(instance.getConnector());
        }
    }
}
