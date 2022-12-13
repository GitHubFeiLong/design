package design.prototype.work.w4;

import java.io.*;
import java.util.Objects;

/**
 * 类描述：
 * 数据图表的具体原型类
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 21:23
 */
public class DataChart implements Serializable, Cloneable {
    //~fields
    //==================================================================================================================
    private String number;
    private String color;
    private Data data;

    //~methods
    //==================================================================================================================


    public DataChart(String number, String color, Data data) {
        this.number = number;
        this.color = color;
        this.data = data;
    }


    @Override
    protected DataChart clone() throws CloneNotSupportedException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ByteArrayInputStream bais;
        ObjectInputStream ois = null;
        try (
                ObjectOutputStream oos = new ObjectOutputStream(baos);
        ) {

            // 写出
            oos.writeObject(this);
            // 从输出流中读取出来
            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            return (DataChart)ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataChart dataChart = (DataChart) o;
        return Objects.equals(number, dataChart.number) && Objects.equals(color, dataChart.color) && Objects.equals(data, dataChart.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, color, data);
    }

    @Override
    public String toString() {
        return "DataChart{" +
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
