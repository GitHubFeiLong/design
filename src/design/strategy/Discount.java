package design.strategy;

/**
 * 折扣类，充当抽象策略类
 * @ClassName Discount
 * @Description TODO
 * @Author msi
 * @Date 2019/6/26 18:54
 */
public interface Discount {
	double calculate(double price);
}
