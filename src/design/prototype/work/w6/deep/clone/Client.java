package design.prototype.work.w6.deep.clone;

/**
 * 类描述：
 * 深克隆，互相不影响，是一个全新的对象
 * 使用序列化和反序列化的方式。
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
