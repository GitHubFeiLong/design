package design.flyweight.work1;

import design.flyweight.work.FlyweightAbstract;

/**
 * @ClassName Client
 * @Description TODO 测试
 * @Author msi
 * @Date 2019/6/14 20:34
 */
public class Client {
	public static void main(String[] args) {
		MultimediaAbstract f1, f2, f3, f4, f5, f6, f7;
		FlyweightFactory factory = FlyweightFactory.getInstance();
		f1 = factory.getMultimedia("photo");
		f6 = factory.getMultimedia("photo");

		f2 = factory.getMultimedia("animation");
		f3 = factory.getMultimedia("animation");

		f4 = factory.getMultimedia("video");
		f5 = factory.getMultimedia("photo");

		f7 = factory.getMultimedia("video");

		f1.display(new External("D盘/A文件夹", "1024kb"));
		f2.display(new External("A盘/C文件夹", "200kb"));
		f3.display(new External("A盘/A文件夹", "7Mb"));
		f4.display(new External("V盘/a文件夹", "500Mb"));
		f5.display(new External("1盘/1文件夹", "1024kb"));
		f6.display(new External("C盘/A文件夹", "1024kb"));
		f7.display(new External("E盘/E文件夹", "500Mb"));
	}
}
