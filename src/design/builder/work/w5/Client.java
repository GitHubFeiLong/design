package design.builder.work.w5;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/11 19:50
 */
public class Client {
    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    public static void main(String[] args) {
        DisplayModelBuilder displayModelBuilder = new MemoryDisplayModelBuilder();
        DisplayModelDirector displayModelDirector = new DisplayModelDirector(displayModelBuilder);
        DisplayModel construct = displayModelDirector.construct();
        System.out.println("construct = " + construct);
    }
}
