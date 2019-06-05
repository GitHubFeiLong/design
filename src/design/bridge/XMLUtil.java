package design.bridge;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLUtil {

	public static Object getBean(String args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			File file = new File("src/design/bridge/config.xml");
			Document document = builder.parse(file);
			NodeList n1 = null;
			Node classNode = null;
			String cName = null;
			
			n1 = document.getElementsByTagName("className");
			
			// 获取第一个包含类名的节点，即扩充抽象类
			if (args.equals("image")) {
				classNode = n1.item(0).getFirstChild();
			}
			// 获取第二个包含类名的节点，即具体实现类
			if (args.equals("os")) {
				classNode = n1.item(1).getFirstChild();
			}
			
			cName = classNode.getNodeValue();
			// 通过类名生成实例对象并将其返回
			Object o = Class.forName(cName).newInstance();
			
			return o;
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
		
	}
}

