package design.composite;
/**
 * 视频文件类，充当叶子构建类
 * @author msi
 * @date 2019年6月9日
 */
public class VideoFile extends AbstractFile{

	private String name;
	
	public VideoFile(String name) {
		this.name = name;
	}
	
	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("对不起，不支持该方法");
		
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("对不起，不支持该方法");
		
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("对不起，不支持该方法");
		return null;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		// 模拟杀毒
		System.out.println("----对视频文件'" + name + "'进行杀毒");
	}

}
