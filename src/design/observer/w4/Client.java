package design.observer.w4;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2023/1/28 20:39
 */
public class Client {
    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    public static void main(String[] args) {
        Subject subject = new CatSubject();

        Observer mouseObserver = new MouseObserver();
        Observer masterObserver = new MasterObserver();

        subject.attach(mouseObserver);
        subject.attach(masterObserver);

        subject.myNotify();

    }
}
