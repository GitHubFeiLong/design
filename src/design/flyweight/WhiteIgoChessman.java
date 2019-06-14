package design.flyweight;

/**
 * @ClassName WhiteIgoChessman
 * @Description TODO 白色棋子类，充当具体享元类
 * @Author msi
 * @Date 2019/6/14 19:26
 */
public class WhiteIgoChessman extends IgoChessman{
    @Override
    public String getColor() {
        return "白色";
    }
}
