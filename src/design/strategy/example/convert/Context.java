package design.strategy.example.convert;

import java.lang.reflect.Field;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 16:18
 */
public class Context<T>{
    private QueueConvertStrategy<T> queueConvertStrategy;

    public Context() {
    }
    public Context(QueueConvertStrategy queueConvertStrategy) {
        this.queueConvertStrategy = queueConvertStrategy;
    }
    public void setQueueConvertStrategy(QueueConvertStrategy queueConvertStrategy) {
        this.queueConvertStrategy = queueConvertStrategy;
    }

    public T execute(T data) {
        return queueConvertStrategy.convert(data);
    }

}
