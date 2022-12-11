package design.builder.work.w4;

/**
 * 类描述：
 * 使用构造者模式创建电脑产品
 * @author cfl
 * @version 1.0
 * @date 2022/12/11 19:12
 */
public class Client {
    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    public static void main(String[] args) {
        ComputerBuilder cb = new ServerComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector(cb);
        Computer construct = computerDirector.construct();
        System.out.println("construct = " + construct);
    }
}
