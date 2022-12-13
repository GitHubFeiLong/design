package design.singleton.work.w6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 使用懒汉式实现负载均衡器
 * @author msi
 * @date 2019年5月29日
 */
public class LazyLoadBalancer {
	private volatile static LazyLoadBalancer instance = null;
	private List serverList = null;
	
	private LazyLoadBalancer() {
		serverList = new ArrayList();
	}
	
	public static LazyLoadBalancer getInstance() {
		if (instance == null) {
			synchronized(LazyLoadBalancer.class) {
				if (instance == null) {
					instance = new LazyLoadBalancer();
				}
			}
		}
		return instance;
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
