package design.flyweight.work1;

/**
 * @ClassName MultimediaAbstract
 * @Description TODO 多媒体文件抽象享元类，
 * @Author msi
 * @Date 2019/6/14 20:22
 */
public abstract class MultimediaAbstract {
	public abstract String getFileName();

	public void display(External e){
		System.out.println("文件类型：" + this.getFileName() + "，文件位置：" + e.getAddress() + ",文件大小：" + e.getSize());
	}
}
