package design.singleton.work.w6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IoDHLoadBalancer {
	
	private List serverList = null;
	
	private IoDHLoadBalancer() {
		serverList = new ArrayList();
	}
	
	// 私有静态内部类
	private static class HolderClass{
		private  static IoDHLoadBalancer instance = new IoDHLoadBalancer();
	}
	
	public static IoDHLoadBalancer getInstance() {
		return HolderClass.instance;
	}
	public void addServer(String server) {
		serverList.add(server);
	}
	
	public void removeServer(String server) {
		serverList.remove(server);
	}
	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(serverList.size());
		return (String)serverList.get(i);
	}
}
