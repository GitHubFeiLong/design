package design.observer.w4;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2023/1/28 20:33
 */
public abstract class Subject {
    //~fields
    //==================================================================================================================
    protected List<Observer> observers;
    //~methods
    //==================================================================================================================
    public Subject () {
        this.observers = new ArrayList<>();
    }

    protected void attach(Observer observer) {
        this.observers.add(observer);
    }

    protected void detach(Observer observer) {
        this.observers.remove(observer);
    }

    public void myNotify() {
        for (Observer observer:observers) {
            observer.update();
        }
    }

}
