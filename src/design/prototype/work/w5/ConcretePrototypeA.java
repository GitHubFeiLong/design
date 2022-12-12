package design.prototype.work.w5;

import java.util.Objects;

/**
 * 类描述：
 * 具体原型类
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 21:43
 */
public class ConcretePrototypeA extends Prototype{
    //~fields
    //==================================================================================================================
    private int age;

    private String name;

    private String address;

    //~methods
    //==================================================================================================================

    public ConcretePrototypeA(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    /**
     * 克隆接口
     * @return
     */
    @Override
    public Prototype copy() {
        return new ConcretePrototypeA(this.getAge(), this.getName(), this.getAddress());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcretePrototypeA that = (ConcretePrototypeA) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, address);
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
