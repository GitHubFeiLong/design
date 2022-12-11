package design.factory.method.work.w4;

/**
 * 类描述：
 * 奔驰工厂-具体工厂
 * @author cfl
 * @version 1.0
 * @date 2022/12/10 19:26
 */
public class BenzFactory extends AbstractFactory{

    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    /**
     * 创建汽车工厂方法
     *
     * @return
     */
    @Override
    public Car create() {
        return new BenzCar();
    }
}
