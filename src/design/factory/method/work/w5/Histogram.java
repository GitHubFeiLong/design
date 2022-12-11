package design.factory.method.work.w5;

/**
 * 类描述：
 * 柱状图-具体产品
 * @author cfl
 * @version 1.0
 * @date 2022/12/10 19:35
 */
public class Histogram extends Graphics{
    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
