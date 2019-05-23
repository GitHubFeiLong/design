package design.prototype;

import java.io.IOException;

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
