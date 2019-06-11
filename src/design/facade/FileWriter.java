package design.facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件保存类，充当子系统类
 * @author msi
 * @date 2019年6月11日
 */
public class FileWriter {
	public void write(String encryptStr, String fileNameDes) {
		System.out.println("保存密文，写入文件");
		try {
			FileOutputStream fos = new FileOutputStream(fileNameDes);
			fos.write(encryptStr.getBytes());
		} catch (FileNotFoundException e) {
			System.out.println("写入文件找不到");
		} catch (IOException e) {
			System.out.println("写入操作失败");
		}
	}

}
