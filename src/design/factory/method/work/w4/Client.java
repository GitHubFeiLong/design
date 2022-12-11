package design.factory.method.work.w4;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/10 19:29
 */
public class Client {
    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    public static void main(String[] args) {
        AbstractFactory factory = new BMWFactory();
        factory.create();
    }
}
