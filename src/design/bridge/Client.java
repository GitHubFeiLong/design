package design.bridge;
/**
 * 桥接模式
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
