package design.facade;

public class NewEncryptEacade extends AbstractEncryptEacade{

	private FileReader reader;
	private FileWriter writer;
	private NewCipherMachine cipher;
	
	
	
	public NewEncryptEacade() {
		super();
		reader = new FileReader();
		writer = new FileWriter();
		cipher = new NewCipherMachine();
	}



	@Override
	public void fileEncrypt(String fileNameSrc, String fileNameDes) {
		String plainText = reader.read(fileNameSrc);
		String encryptStr = cipher.encrypt(plainText);
		writer.write(encryptStr, fileNameDes);
		
	}

}
