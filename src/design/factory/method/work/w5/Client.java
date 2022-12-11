package design.factory.method.work.w5;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/10 19:39
 */
public class Client {
    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    public static void main(String[] args) {
        AbstractFactory factory = new HistogramFactory();
        Graphics graphics = factory.create();
        graphics.display();
    }
}
