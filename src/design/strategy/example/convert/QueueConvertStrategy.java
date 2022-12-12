package design.strategy.example.convert;

import java.lang.reflect.Field;

/**
 * 类描述：
 * 行列转换的策略接口
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 16:14
 */
public interface QueueConvertStrategy<T> {

    /**
     * 行列转换
     * @param data 待行列转换的数据
     * @return
     */
    T convert(T data);
}
