package design.bridge;

public class PNGImage extends Image{

	@Override
	public void parseFile(String fileName) {
		// TODO Auto-generated method stub
		// 模拟解析JPG文件并获得一个像素矩阵对象m
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName + ", 格式为PNG");
		
	}

}
