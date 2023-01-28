package design.observer.w4;

/**
 * 类描述：
 * 主人观察者
 * @author cfl
 * @version 1.0
 * @date 2023/1/28 20:38
 */
public class MasterObserver implements Observer {

    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    /**
     * 通知方法
     */
    @Override
    public void update() {
        System.out.println("主人被惊醒");
    }
}
