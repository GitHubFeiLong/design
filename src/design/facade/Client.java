package design.facade;
/**
 * 外观模式（Facade Pattern）：为子系统中的一组接口提供一个统一的入口。外观模式定义了一个高层接口，
 * 这个接口使得这一子系统更加容易使用。又称为门面模式
 * @author msi
 * @date 2019年6月19日
 */
public class Client {
	public static void main(String [] args) {
		// 可以将这个写一个XML文件
		EncryptFacade facade = new EncryptFacade();
		facade.fileEncrypt("src//design//facade//fileNameSrc.txt", "src//design//facade//fileNameDes.txt");
	}

}
