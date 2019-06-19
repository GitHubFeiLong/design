package design.prototype;

import java.io.IOException;
/**
 * 原型模式
 * @author msi
 * @date 2019年6月19日
 */
public class Client {
	public static void main(String [] args) throws ClassNotFoundException, IOException {
		WeeklyLog log_previous,log_new;
		log_previous = new WeeklyLog();
		Attachment attachment = new Attachment();
		log_previous.setAttachment(attachment);
		
		log_new = log_previous.clone();
		System.out.println("周报是否相同：" + (log_previous == log_new));
		System.out.println("附件是否相同：" + (log_previous.getAttachment()==log_new.getAttachment()));
		
	}

}
