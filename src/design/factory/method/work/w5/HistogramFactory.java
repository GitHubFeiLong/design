package design.factory.method.work.w5;

/**
 * 类描述：
 * 柱状图工厂-具体工厂
 * @author cfl
 * @version 1.0
 * @date 2022/12/10 19:38
 */
public class HistogramFactory extends AbstractFactory{

    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    @Override
    public Graphics create() {
        return new Histogram();
    }
}
