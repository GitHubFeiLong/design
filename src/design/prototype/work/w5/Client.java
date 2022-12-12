package design.prototype.work.w5;

/**
 * 类描述：
 * 客户端类
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 21:45
 */
public class Client {
    //~fields
    //==================================================================================================================

    //~methods
    //==================================================================================================================
    public static void main(String[] args) {
        PrototypeManager instance = PrototypeManager.getInstance();
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA(10, "张三", "河南");
        ConcretePrototypeB concretePrototypeB = new ConcretePrototypeB("三年一班", "100平方米");
        instance.put("A", concretePrototypeA);
        instance.put("B", concretePrototypeB);

        Prototype a = instance.get("A");
        System.out.println("a = " + a);
        Prototype b = instance.get("B");
        System.out.println("b = " + b);
    }
}
