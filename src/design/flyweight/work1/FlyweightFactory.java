package design.flyweight.work1;

import java.util.Hashtable;

/**
 * @ClassName FlyweightFactory
 * @Description TODO 享元类工厂类
 * @Author msi
 * @Date 2019/6/14 20:30
 */
public class FlyweightFactory {
	private static FlyweightFactory instance = new FlyweightFactory();
	private static Hashtable ht;

	public FlyweightFactory() {
		ht = new Hashtable();
		MultimediaAbstract photo, animation, video;
		photo = new Photo();
		animation = new Animation();
		video = new Video();
		ht.put("photo", photo);
		ht.put("animation", animation);
		ht.put("video", video);
	}

	public static FlyweightFactory getInstance(){
		return instance;
	}

	public static MultimediaAbstract getMultimedia(String str){
		return (MultimediaAbstract) ht.get(str);
	}
}
