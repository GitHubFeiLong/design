package design.facade;

public class Client {
	public static void main(String [] args) {
		// 可以将这个写一个XML文件
		EncryptFacade facade = new EncryptFacade();
		facade.fileEncrypt("src//design//facade//fileNameSrc.txt", "src//design//facade//fileNameDes.txt");
	}

}
