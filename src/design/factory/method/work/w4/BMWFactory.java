package design.factory.method.work.w4;

/**
 * 类描述：
 * 宝马工厂-具体工厂
 * @author cfl
 * @version 1.0
 * @date 2022/12/10 19:25
 */
public class BMWFactory extends AbstractFactory{

    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    /**
     * 创建宝马汽车工厂方法
     *
     * @return
     */
    @Override
    public Car create() {
        return new BMWCar();
    }
}
