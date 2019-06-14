package design.flyweight;

/**
 * @ClassName BlackIgoChessman
 * @Description TODO 黑色棋子类，充当具体享元类
 * @Author msi
 * @Date 2019/6/14 19:22
 */
public class BlackIgoChessman extends IgoChessman{
    @Override
    public String getColor() {
        return "黑色";
    }
}
