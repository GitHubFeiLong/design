package design.composite;

import java.util.ArrayList;

/**
 * 文件夹类，充当容器构建类
 * @author msi
 * @date 2019年6月9日
 */
public class Folder extends AbstractFile{

	// 定义集合fileList,用于存储AbstractFile类型的成员
	private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
	private String name;
	
	public Folder(String name) {
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.add(file);
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.remove(file);
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		return fileList.get(i);
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		// 模拟杀毒
		System.out.println("******对文件夹'" + name + "'进行杀毒");
		for (Object obj : fileList) {
			((AbstractFile)obj).killVirus();
		}
	}
	
	
}
