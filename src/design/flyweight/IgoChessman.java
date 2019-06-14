package design.flyweight;

/**
 * @ClassName flyweight
 * @Description TODO 围棋棋子类，充当抽象享元类
 * @Author msi
 * @Date 2019/6/14 19:19
 */
public abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinates coord){
        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + coord.getY() );
    }
}
