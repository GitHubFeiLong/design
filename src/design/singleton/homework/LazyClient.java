package design.singleton.homework;

public class LazyClient {
	public static void main(String[] args) {
		LazyLoadBalancer balancer1, balancer2, balancer3;
		balancer1 = LazyLoadBalancer.getInstance();
		balancer2 = LazyLoadBalancer.getInstance();
		balancer3 = LazyLoadBalancer.getInstance();
		
		if (balancer1 == balancer2 && balancer2 == balancer3) {
			System.out.println("同一个负载均衡器");
		}
		
		balancer1.addServer("server 1");
		balancer1.addServer("server 2");
		balancer3.addServer("server 3");
		balancer2.addServer("server 4");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("使用服务器：" + balancer1.getServer());
		}
		
	}

}
