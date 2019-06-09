package design.composite;
/**
 * 抽象文件类，充当抽象构建类
 * @author msi
 * @date 2019年6月9日
 */
public abstract class AbstractFile {
	public abstract void add(AbstractFile file);
	public abstract void remove(AbstractFile file);
	public abstract AbstractFile getChild(int i);
	public abstract void killVirus();
}
