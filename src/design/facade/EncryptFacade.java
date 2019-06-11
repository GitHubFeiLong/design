package design.facade;
/**
 * 加密外观类，充当外观类
 * @author msi
 * @date 2019年6月11日
 */
public class EncryptFacade extends NewEncryptEacade{
	// 维持对子系统对象的依赖
	private FileReader reader;
	private FileWriter writer;
	private CipherMachine cipher;
	
	public EncryptFacade() {
		super();
		reader = new FileReader();
		writer = new FileWriter();
		cipher = new CipherMachine();
	}
	// 调用子系统对象的业务方法
	public void fileEncrypt(String fileNameSrc, String fileNameDes) {
		String plainStr = reader.read(fileNameSrc);
		String encryptStr = cipher.encrypt(plainStr);
		writer.write(encryptStr, fileNameDes);
	}
	

}
