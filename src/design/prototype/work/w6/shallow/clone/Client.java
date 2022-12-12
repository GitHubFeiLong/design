package design.prototype.work.w6.shallow.clone;

/**
 * 类描述：
 * 浅克隆，修改对象的引用成员变量，会影响所有克隆出来的对象
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 21:59
 */
public class Client {
    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    @SuppressWarnings("all")
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("重庆");
        Customer customer = new Customer(address);

        Customer clone = customer.clone();

        System.out.println("clone = " + clone);
    }
}
