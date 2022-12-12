package design.prototype.work.w4;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 21:31
 */
public class Data implements Serializable {
    //~fields
    //==================================================================================================================
    private Integer size;

    private Integer[] datas;

    //~methods
    //==================================================================================================================

    public Data(Integer size, Integer[] datas) {
        this.size = size;
        this.datas = datas;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer[] getDatas() {
        return datas;
    }

    public void setDatas(Integer[] datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "Data{" +
                "size=" + size +
                ", datas=" + Arrays.toString(datas) +
                '}';
    }
}
