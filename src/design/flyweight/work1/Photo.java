package design.flyweight.work1;

/**
 * @ClassName Photo
 * @Description TODO 图片具体享元类
 * @Author msi
 * @Date 2019/6/14 20:26
 */
public class Photo extends MultimediaAbstract {
	@Override
	public String getFileName() {
		return "图片";
	}
}
