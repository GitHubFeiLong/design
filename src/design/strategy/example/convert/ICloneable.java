package design.strategy.example.convert;

import java.io.*;

/**
 * 接口描述：
 * 自定义接口，深克隆
 * @author cfl
 * @version 1.0
 * @date 2022/12/13 11:18
 */
public interface ICloneable<T> extends Serializable {

    /**
     * 深克隆,默认使用序列化和反序列化的方式实现
     * @return
     */
    default T deepClone() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectInputStream objectInputStream = null;
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            objectOutputStream.writeObject(this);

            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));

            return (T)objectInputStream.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
