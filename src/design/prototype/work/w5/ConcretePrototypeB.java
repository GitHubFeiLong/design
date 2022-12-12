package design.prototype.work.w5;

import java.util.Objects;

/**
 * 类描述：
 * 具体原型类
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 21:43
 */
public class ConcretePrototypeB extends Prototype{
    //~fields
    //==================================================================================================================
    private String classesName;

    private String size;

    //~methods
    //==================================================================================================================


    public ConcretePrototypeB(String classesName, String size) {
        this.classesName = classesName;
        this.size = size;
    }

    /**
     * 克隆接口
     * @return
     */
    @Override
    public Prototype copy() {
        return new ConcretePrototypeB(this.getClassesName(), this.getSize());
    }

    @Override
    public String toString() {
        return "ConcretePrototypeB{" +
                "classesName='" + classesName + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcretePrototypeB that = (ConcretePrototypeB) o;
        return Objects.equals(classesName, that.classesName) && Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classesName, size);
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
