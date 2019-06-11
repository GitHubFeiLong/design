package design.facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileReader:文件读取类，充当子系统类
 * @author msi
 * @date 2019年6月11日
 */
public class FileReader {
	public String read(String fileNameSrc) {
		System.out.println("读取文件，获取明文：");
		StringBuffer sb = new StringBuffer();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileNameSrc);
			int data;
			while((data = fis.read()) != -1) {
				sb.append((char)data);
			}
			
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("文件操作错误");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}

}
