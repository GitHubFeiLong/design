package design.bridge;
/**
 * 桥接模式(bridge Pattern):将抽象部分与它的实现部分解耦，使得两者都能独立变化
 * @author msi
 * @date 2019年6月19日
 */
public class Client {
	public static void main(String [] args) {
		Image image;
		ImageImp imp;
		image = (Image)XMLUtil.getBean("image");
		imp = (ImageImp)XMLUtil.getBean("os");
		
		image.setImp(imp);
		image.parseFile("小龙女");
	}
}
