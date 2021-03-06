package design.composite;
/**
 * 组合模式（Composite Pattern）：组合多个对象形成树形结构以表示具有部分-整体关系的层次结构。
 * 组合模式让客户段可以统一对待单个对象和组合对象。整体部分模式
 * @author msi
 * @date 2019年6月19日
 */
public class Client {
	public static void main(String [] args) {
		// 针对抽象构件编程
		AbstractFile file1, file2, file3, file4, file5, folder1, folder2, folder3, folder4;
		folder1 = new Folder("Sunny的资料");
		folder2 = new Folder("图像文本");
		folder3 = new Folder("文本文件");
		folder4 = new Folder("视频文件");
		
		file1 = new ImageFile("小龙女.jpg");
		file2 = new ImageFile("张无忌.jpg");
		file3 = new TextFile("九阴真经.txt");
		file4 = new TextFile("葵花宝典.doc");
		file5 = new VideoFile("笑傲江湖.rmvb");
		
		folder2.add(file1);
		folder2.add(file2);
		folder3.add(file3);
		folder3.add(file4);
		folder4.add(file5);
		folder1.add(folder2);
		folder1.add(folder3);
		folder1.add(folder4);
		
		// 从‘Sunny的资料’节点开始进行杀毒操作
		folder1.killVirus();
	}

}
